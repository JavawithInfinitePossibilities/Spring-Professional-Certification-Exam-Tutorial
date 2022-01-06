package com.sid.tutorials.spring.module01.validator;

import java.util.Collection;

import com.sid.tutorials.spring.module01.ds.Record;

public interface RecordsValidator {
    void validate(Collection<Record> records);
}
