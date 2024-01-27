package com.sid.tutorials.spring.module01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.reader.RecordsReader;

@Service
public class RecordsService05 {

    @Autowired
    public void setRecordsReaders(List<RecordsReader> recordsReaders) {
        System.out.println(getClass().getSimpleName() + " setRecordsReaders:");
        recordsReaders.stream()
                .map(r -> "\t" + r.getClass().getSimpleName())
                .forEach(System.out::println);
    }
}
