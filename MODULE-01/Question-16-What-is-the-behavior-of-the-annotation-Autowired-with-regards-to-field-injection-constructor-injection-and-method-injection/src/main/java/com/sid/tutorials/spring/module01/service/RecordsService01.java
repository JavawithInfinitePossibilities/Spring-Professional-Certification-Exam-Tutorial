package com.sid.tutorials.spring.module01.service;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.backup.DbRecordsBackup;
import com.sid.tutorials.spring.module01.bls.DbRecordsProcessor;
import com.sid.tutorials.spring.module01.non.beans.RecordsHash;
import com.sid.tutorials.spring.module01.non.beans.RecordsUtil;
import com.sid.tutorials.spring.module01.non.beans.RecordsValidator;
import com.sid.tutorials.spring.module01.reader.DbRecordsReader;
import com.sid.tutorials.spring.module01.writer.DbRecordsWriter;

@Service
public class RecordsService01 {
    @Autowired
    public DbRecordsReader recordsReader;
    @Autowired
    protected DbRecordsBackup recordsBackup;
    @Autowired
    private DbRecordsProcessor recordsProcessor;
    @Autowired
    DbRecordsWriter recordsWriter;
    @Autowired
    private Optional<RecordsHash> recordsHash;
    @Autowired
    @Nullable
    private RecordsUtil recordsUtil;
    @Autowired(required = false)
    private RecordsValidator recordsValidator;

    public RecordsService01() {
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" +
                        getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n" +
                        getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n" +
                        getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" +
                        getClass().getSimpleName() + " recordsValidator = " + recordsValidator + "\n"
        );
    }

    @PostConstruct
    public void init() {
        System.out.println(
                getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n" +
                        getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" +
                        getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n" +
                        getClass().getSimpleName() + " recordsWriter = " + recordsWriter + "\n" +
                        getClass().getSimpleName() + " recordsHash = " + recordsHash + "\n" +
                        getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" +
                        getClass().getSimpleName() + " recordsValidator = " + recordsValidator + "\n"
        );
    }
}
