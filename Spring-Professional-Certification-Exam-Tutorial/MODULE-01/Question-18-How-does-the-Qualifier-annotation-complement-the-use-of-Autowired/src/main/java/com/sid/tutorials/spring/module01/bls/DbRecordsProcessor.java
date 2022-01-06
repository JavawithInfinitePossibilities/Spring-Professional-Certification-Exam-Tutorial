package com.sid.tutorials.spring.module01.bls;

import java.util.Collection;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
public class DbRecordsProcessor implements RecordsProcessor {
    @Override
    public Collection<Record> processRecords(Collection<Record> records) {
        return Collections.emptyList();
    }
}
