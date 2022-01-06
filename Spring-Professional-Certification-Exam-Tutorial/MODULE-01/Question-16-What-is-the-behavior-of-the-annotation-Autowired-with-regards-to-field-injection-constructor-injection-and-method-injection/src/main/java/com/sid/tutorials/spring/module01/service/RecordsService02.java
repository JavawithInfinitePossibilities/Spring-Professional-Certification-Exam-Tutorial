package com.sid.tutorials.spring.module01.service;

import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.backup.DbRecordsBackup;
import com.sid.tutorials.spring.module01.bls.DbRecordsProcessor;
import com.sid.tutorials.spring.module01.reader.DbRecordsReader;
import com.sid.tutorials.spring.module01.writer.DbRecordsWriter;

@Service
public class RecordsService02 {
	public RecordsService02(DbRecordsReader recordsReader, DbRecordsBackup recordsBackup,
			DbRecordsProcessor recordsProcessor, DbRecordsWriter recordsWriter) {
		System.out.println(getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n"
				+ getClass().getSimpleName() + " recordsBackup = " + recordsBackup + "\n" + getClass().getSimpleName()
				+ " recordsProcessor = " + recordsProcessor + "\n" + getClass().getSimpleName() + " recordsWriter = "
				+ recordsWriter + "\n");
	}
}
