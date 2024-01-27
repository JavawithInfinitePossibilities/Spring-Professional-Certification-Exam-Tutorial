package com.sid.tutorials.spring.module01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.bls.DbRecordsProcessor;
import com.sid.tutorials.spring.module01.non.beans.RecordsHash;
import com.sid.tutorials.spring.module01.non.beans.RecordsUtil;
import com.sid.tutorials.spring.module01.non.beans.RecordsValidator;
import com.sid.tutorials.spring.module01.reader.DbRecordsReader;

@Service
public class RecordsService03 {

	@Autowired
	private RecordsService03(DbRecordsReader recordsReader, DbRecordsProcessor recordsProcessor,
			Optional<RecordsUtil> recordsUtil, @Nullable RecordsHash recordsHash,
			@Autowired(required = false) RecordsValidator recordsValidator) {
		System.out.println(getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n"
				+ getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n"
				+ getClass().getSimpleName() + " recordsUtil = " + recordsUtil + "\n" + getClass().getSimpleName()
				+ " recordsHash = " + recordsHash + "\n" + getClass().getSimpleName() + " recordsValidator = "
				+ recordsValidator + "\n");
	}

	// @Autowired
	RecordsService03(DbRecordsReader recordsReader, DbRecordsProcessor recordsProcessor) {
		System.out.println(getClass().getSimpleName() + " recordsReader = " + recordsReader + "\n"
				+ getClass().getSimpleName() + " recordsProcessor = " + recordsProcessor + "\n");
	}
}
