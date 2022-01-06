package com.sid.tutorials.spring.module01.writer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.FinancialMonthSummary;
import com.sid.tutorials.spring.module01.ds.FinancialQuarterSummary;
import com.sid.tutorials.spring.module01.ds.FinancialYearSummary;

@Component("file-writer")
@Primary
class FileStoreFinancialReportWriter implements FinancialReportWriter {
	@Override
	public void appendFreeText(String title) {
		System.out.println("File Writer => appendFreeText");
	}

	@Override
	public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
		System.out.println("File Writer => appendFinancialYearSummary");
	}

	@Override
	public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
		System.out.println("File Writer => appendFinancialQuarterSummary");
	}

	@Override
	public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
		System.out.println("File Writer => appendFinancialMonthSummary");
	}
}
