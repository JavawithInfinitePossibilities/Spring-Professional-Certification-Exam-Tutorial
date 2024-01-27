package com.sid.tutorials.spring.module01.with.aop.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.with.aop.bls.ComplexReportFormatter;
import com.sid.tutorials.spring.module01.with.aop.bls.ComplexReportProvider;
import com.sid.tutorials.spring.module01.with.aop.bls.ComplexReportRepository;
import com.sid.tutorials.spring.module01.with.aop.ds.FormattedReport;
import com.sid.tutorials.spring.module01.with.aop.ds.Report;

@Component("complexReportActionWithaop")
public class ComplexReportAction {

    @Autowired
    private ComplexReportProvider complexReportProvider;
    @Autowired
    private ComplexReportFormatter complexReportFormatter;
    @Autowired
    private ComplexReportRepository complexReportRepository;

    public void perform() throws InterruptedException {
        Report report = complexReportProvider.getReport();
        FormattedReport formattedReport = complexReportFormatter.formatReport(report);
        complexReportRepository.save(formattedReport);
        report = complexReportProvider.getReport();
    }
}
