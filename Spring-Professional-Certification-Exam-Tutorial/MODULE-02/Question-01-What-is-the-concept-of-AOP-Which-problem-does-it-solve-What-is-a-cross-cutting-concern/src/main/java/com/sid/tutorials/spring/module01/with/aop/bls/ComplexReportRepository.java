package com.sid.tutorials.spring.module01.with.aop.bls;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.with.aop.annotations.PerformanceLogger;
import com.sid.tutorials.spring.module01.with.aop.ds.Report;

@Component("complexReportRepositoryWithaop")
public class ComplexReportRepository {
    @PerformanceLogger
    public void save(Report report) throws InterruptedException {
        System.out.println("Saving the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report saved");
    }
}
