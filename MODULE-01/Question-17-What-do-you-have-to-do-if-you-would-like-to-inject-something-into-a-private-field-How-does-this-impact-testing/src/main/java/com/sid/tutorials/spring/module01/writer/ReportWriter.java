package com.sid.tutorials.spring.module01.writer;

import com.sid.tutorials.spring.module01.ds.Report;

public interface ReportWriter {
    void write(Report report, String reportName);
}
