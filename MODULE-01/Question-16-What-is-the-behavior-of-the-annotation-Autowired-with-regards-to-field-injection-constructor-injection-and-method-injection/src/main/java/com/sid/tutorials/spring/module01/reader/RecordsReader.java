package com.sid.tutorials.spring.module01.reader;

import java.util.Collection;

import com.sid.tutorials.spring.module01.ds.Record;

public interface RecordsReader {
    Collection<Record> readRecords();
}
