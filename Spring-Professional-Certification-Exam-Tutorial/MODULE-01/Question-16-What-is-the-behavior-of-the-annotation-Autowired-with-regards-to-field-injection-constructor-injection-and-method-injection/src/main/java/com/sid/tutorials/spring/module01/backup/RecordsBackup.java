package com.sid.tutorials.spring.module01.backup;

import java.util.Collection;

import com.sid.tutorials.spring.module01.ds.Record;

public interface RecordsBackup {
    void backupRecords(Collection<Record> records);
}
