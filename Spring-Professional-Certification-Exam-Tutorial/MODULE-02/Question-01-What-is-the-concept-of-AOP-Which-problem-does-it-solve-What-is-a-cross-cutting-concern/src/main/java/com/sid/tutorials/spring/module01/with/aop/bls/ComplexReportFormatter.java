package com.sid.tutorials.spring.module01.with.aop.bls;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.with.aop.annotations.PerformanceLogger;
import com.sid.tutorials.spring.module01.with.aop.ds.FormattedReport;
import com.sid.tutorials.spring.module01.with.aop.ds.Report;

@Component("complexReportFormatterWithaop")
public class ComplexReportFormatter {
    @PerformanceLogger
    public FormattedReport formatReport(Report report) throws InterruptedException {
        System.out.println("Formatting the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("Report Formatted");

        return new FormattedReport(report);
    }
}
