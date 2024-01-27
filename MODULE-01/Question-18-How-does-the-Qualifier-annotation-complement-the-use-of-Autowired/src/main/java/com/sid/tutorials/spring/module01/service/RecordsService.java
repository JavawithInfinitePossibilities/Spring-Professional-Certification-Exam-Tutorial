package com.sid.tutorials.spring.module01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.bls.RecordsProcessor;
import com.sid.tutorials.spring.module01.reader.RecordsReader;
import com.sid.tutorials.spring.module01.validator.RecordsValidator;
import com.sid.tutorials.spring.module01.validator.RecordsValidatorType;
import com.sid.tutorials.spring.module01.validator.RecordsValidatorType.RecordsValidatorMode;
import com.sid.tutorials.spring.module01.writer.RecordsWriter;

@Service
public class RecordsService {
	@Autowired
	@Qualifier("dbRecordsProcessor")
	private RecordsProcessor recordsProcessor;

	@Autowired
	@Qualifier("file-records-reader")
	private RecordsReader recordsReader;

	@Autowired
	@Qualifier("db-writer")
	private RecordsWriter recordsWriter;

	@Autowired
	@RecordsValidatorType(RecordsValidatorMode.FILE)
	private RecordsValidator recordsValidator;
}
