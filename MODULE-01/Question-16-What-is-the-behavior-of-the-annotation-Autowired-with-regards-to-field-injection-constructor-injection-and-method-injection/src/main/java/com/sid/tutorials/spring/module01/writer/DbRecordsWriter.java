package com.sid.tutorials.spring.module01.writer;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
public class DbRecordsWriter implements RecordsWriter {
    @Override
    public void writeRecords(Collection<Record> records) {

    }
}
