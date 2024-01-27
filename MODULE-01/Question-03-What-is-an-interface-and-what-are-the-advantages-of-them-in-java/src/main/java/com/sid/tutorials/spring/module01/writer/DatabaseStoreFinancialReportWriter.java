package com.sid.tutorials.spring.module01.writer;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.FinancialMonthSummary;
import com.sid.tutorials.spring.module01.ds.FinancialQuarterSummary;
import com.sid.tutorials.spring.module01.ds.FinancialYearSummary;

@Component("database-writer")
class DatabaseStoreFinancialReportWriter implements FinancialReportWriter {
    @Override
    public void appendFreeText(String title) {
        System.out.println("Database Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("Database Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("Database Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("Database Writer => appendFinancialMonthSummary");
    }
}
