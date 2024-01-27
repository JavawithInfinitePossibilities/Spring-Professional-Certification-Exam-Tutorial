package com.sid.tutorials.spring.module01.writer;

import java.util.Collection;

import com.sid.tutorials.spring.module01.ds.Record;

public interface RecordsWriter {
    void writeRecords(Collection<Record> records);
}
