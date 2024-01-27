package com.sid.tutorials.spring.module01.reader;

import java.util.Collection;

import javax.annotation.Priority;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
@Priority(2)
public class WebServiceRecordsReader implements RecordsReader {
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
