package com.sid.tutorials.spring.module01.bls;

import java.util.Collection;

import com.sid.tutorials.spring.module01.ds.Record;

public interface RecordsProcessor {
    Collection<Record> processRecords(Collection<Record> records);
}
