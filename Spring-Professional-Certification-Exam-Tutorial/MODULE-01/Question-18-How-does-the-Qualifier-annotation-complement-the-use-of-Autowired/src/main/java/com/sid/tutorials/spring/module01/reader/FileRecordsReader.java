package com.sid.tutorials.spring.module01.reader;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component("file-records-reader")
public class FileRecordsReader implements RecordsReader {
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
