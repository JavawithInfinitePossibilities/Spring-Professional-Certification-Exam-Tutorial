package com.sid.tutorials.spring.module01.no.aop.bls;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.no.aop.ds.Report;

@Component("complexReportRepositorynoaop")
public class ComplexReportRepository {
    public void save(Report report) throws InterruptedException {
        System.out.println("Saving the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report saved");
    }
}
