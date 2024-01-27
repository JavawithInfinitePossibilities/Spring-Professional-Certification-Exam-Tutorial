package com.sid.tutorials.spring.module04.storage;

import static com.sid.tutorials.spring.module04.utils.StatisticsUtils.averageContentSize;
import static com.sid.tutorials.spring.module04.utils.StatisticsUtils.maxId;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Service
public class FileStorageService implements StorageService {
    private Map<Integer, String> fileStorage = new HashMap<>();
    private Counter objectsCount;
    private AtomicLong averageObjectSize;

    public FileStorageService(MeterRegistry meterRegistry) {
        objectsCount = meterRegistry.counter("storage.object.count", "type", "file");
        averageObjectSize = meterRegistry.gauge("storage.file.object.avg.size", new AtomicLong());
    }

    @Override
    public synchronized int store(String content) {
        int newId = maxId(fileStorage) + 1;

        fileStorage.put(newId, content);
        objectsCount.increment();
        averageObjectSize.set(averageContentSize(fileStorage));

        return newId;
    }

    @Override
    public synchronized Optional<String> fetch(int id) {
        return Optional.ofNullable(fileStorage.get(id));
    }
}
