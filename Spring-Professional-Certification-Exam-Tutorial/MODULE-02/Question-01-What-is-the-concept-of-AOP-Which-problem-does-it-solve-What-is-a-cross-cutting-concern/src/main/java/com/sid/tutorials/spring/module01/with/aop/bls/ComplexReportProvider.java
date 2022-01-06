package com.sid.tutorials.spring.module01.with.aop.bls;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.with.aop.annotations.Cacheable;
import com.sid.tutorials.spring.module01.with.aop.annotations.PerformanceLogger;
import com.sid.tutorials.spring.module01.with.aop.ds.Report;

@Component("complexReportProviderWithaop")
public class ComplexReportProvider {
    @PerformanceLogger
    @Cacheable
    public Report getReport() throws InterruptedException {
        System.out.println("Fetching the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Report created");

        return new Report();
    }
}
