package com.sid.tutorials.spring.module01.backup;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;

@Component
public class DbRecordsBackup implements RecordsBackup {
    @Override
    public void backupRecords(Collection<Record> records) {

    }
}
