package com.sid.tutorials.spring.module01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.non.beans.RecordsValidator;
import com.sid.tutorials.spring.module01.reader.DbRecordsReader;

@Service
public class RecordsService04 {

	@Autowired
	public void setRecordsReader(DbRecordsReader recordsReader) {
		System.out.println(
				getClass().getSimpleName() + " setRecordsReader:\n" + "\trecordsReader = " + recordsReader + "\n");
	}

	// @Autowired
	@Autowired(required = false)
	/*
	 * public void setRecordsReaderAndRecordsValidator(DbRecordsReader
	 * recordsReader, Optional<RecordsValidator> recordsValidator) { public void
	 * setRecordsReaderAndRecordsValidator(DbRecordsReader recordsReader, @Nullable
	 * RecordsValidator recordsValidator) { public void
	 * setRecordsReaderAndRecordsValidator(DbRecordsReader
	 * recordsReader, @Autowired(required = false) RecordsValidator
	 * recordsValidator) {
	 */
	public void setRecordsReaderAndRecordsValidator(DbRecordsReader recordsReader, RecordsValidator recordsValidator) {
		System.out.println(getClass().getSimpleName() + " setRecordsReaderAndRecordsValidator:\n" + "\trecordsReader = "
				+ recordsReader + "\n" + "\trecordsValidator = " + recordsValidator + "\n");
	}
}
