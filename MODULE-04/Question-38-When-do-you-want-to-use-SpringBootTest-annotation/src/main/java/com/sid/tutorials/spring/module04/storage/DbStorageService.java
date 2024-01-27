package com.sid.tutorials.spring.module04.storage;

import static com.sid.tutorials.spring.module04.utils.StatisticsUtils.averageContentSize;
import static com.sid.tutorials.spring.module04.utils.StatisticsUtils.maxId;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Service
public class DbStorageService implements StorageService {
	private Map<Integer, String> dbStorage = new HashMap<>();
	private Counter objectsCount;
	private AtomicLong averageObjectSize;

	public DbStorageService(MeterRegistry meterRegistry) {
		objectsCount = meterRegistry.counter("storage.object.count", "type", "db");
		averageObjectSize = meterRegistry.gauge("storage.db.object.avg.size", new AtomicLong());
	}

	@Override
	public synchronized int store(String content) {
		int newId = maxId(dbStorage) + 1;

		dbStorage.put(newId, content);
		objectsCount.increment();
		averageObjectSize.set(averageContentSize(dbStorage));

		return newId;
	}

	@Override
	public synchronized Optional<String> fetch(int id) {
		return Optional.ofNullable(dbStorage.get(id));
	}

	public synchronized Optional<String> fetch() {
		return Optional.ofNullable(dbStorage.getOrDefault(9999, "sidhanth"));
	}
}
