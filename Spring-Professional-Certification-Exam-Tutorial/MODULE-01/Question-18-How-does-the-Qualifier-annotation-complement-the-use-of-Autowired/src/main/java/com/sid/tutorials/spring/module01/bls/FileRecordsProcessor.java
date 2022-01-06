package com.sid.tutorials.spring.module01.bls;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
public class FileRecordsProcessor implements RecordsProcessor {
    @Override
    public Collection<Record> processRecords(Collection<Record> records) {
        return null;
    }
}
