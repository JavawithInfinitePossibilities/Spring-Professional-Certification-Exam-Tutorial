package com.sid.tutorials.spring.module01.writer;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Report;

@Component
public class DbReportWriter implements ReportWriter {
    @Override
    public void write(Report report, String reportName) {

    }
}
