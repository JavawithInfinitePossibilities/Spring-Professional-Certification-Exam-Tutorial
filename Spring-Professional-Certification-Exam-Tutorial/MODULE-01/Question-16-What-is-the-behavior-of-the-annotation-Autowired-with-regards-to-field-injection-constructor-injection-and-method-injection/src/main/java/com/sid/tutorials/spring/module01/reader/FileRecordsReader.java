package com.sid.tutorials.spring.module01.reader;

import java.util.Collection;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
public class FileRecordsReader implements RecordsReader, Ordered {
    @Override
    public Collection<Record> readRecords() {
        return null;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
