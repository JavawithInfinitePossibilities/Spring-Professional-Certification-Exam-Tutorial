package com.sid.tutorials.spring.module01.reader;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component("db-records-reader")
public class DbRecordsReader implements RecordsReader {
    @Override
    public Collection<Record> readRecords() {
        return Collections.emptyList();
    }
}
