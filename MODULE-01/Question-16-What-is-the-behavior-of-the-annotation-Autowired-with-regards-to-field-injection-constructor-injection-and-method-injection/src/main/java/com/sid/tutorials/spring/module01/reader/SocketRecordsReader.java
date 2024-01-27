package com.sid.tutorials.spring.module01.reader;

import java.util.Collection;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
@Order(1)
public class SocketRecordsReader implements RecordsReader {
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
