package com.sid.tutorials.spring.module01.no.aop.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.no.aop.bls.ComplexReportFormatter;
import com.sid.tutorials.spring.module01.no.aop.bls.ComplexReportProvider;
import com.sid.tutorials.spring.module01.no.aop.bls.ComplexReportRepository;
import com.sid.tutorials.spring.module01.no.aop.ds.FormattedReport;
import com.sid.tutorials.spring.module01.no.aop.ds.Report;
import com.sid.tutorials.spring.module01.no.aop.logger.PerformanceLogger;
import com.sid.tutorials.spring.module01.no.aop.logger.PerformanceLogger.PerformanceLoggerInfo;

@Component("complexReportActionnoaop")
public class ComplexReportAction {

    @Autowired
    private ComplexReportProvider complexReportProvider;
    @Autowired
    private ComplexReportFormatter complexReportFormatter;
    @Autowired
    private ComplexReportRepository complexReportRepository;
    @Autowired
    private PerformanceLogger performanceLogger;

    public void perform() throws InterruptedException {
        PerformanceLoggerInfo performanceLoggerInfo;
        performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
        Report report = complexReportProvider.getReport();
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportFormatter.formatReport(...)");
        FormattedReport formattedReport = complexReportFormatter.formatReport(report);
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportRepository.save(...)");
        complexReportRepository.save(formattedReport);
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
        report = complexReportProvider.getReport();
        performanceLogger.stop(performanceLoggerInfo);
    }
}
