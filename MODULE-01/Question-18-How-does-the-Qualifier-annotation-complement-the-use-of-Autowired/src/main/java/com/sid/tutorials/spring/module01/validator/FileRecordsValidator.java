package com.sid.tutorials.spring.module01.validator;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Record;
import com.sid.tutorials.spring.module01.validator.RecordsValidatorType.RecordsValidatorMode;

@Component
@RecordsValidatorType(RecordsValidatorMode.FILE)
public class FileRecordsValidator implements RecordsValidator {
    @Override
    public void validate(Collection<Record> records) {

    }
}
