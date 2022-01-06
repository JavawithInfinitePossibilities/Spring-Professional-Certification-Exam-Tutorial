package com.sid.tutorials.spring.module01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.dao.FinancialDataDao;
import com.sid.tutorials.spring.module01.ds.FinancialMonthSummary;
import com.sid.tutorials.spring.module01.ds.FinancialQuarterSummary;
import com.sid.tutorials.spring.module01.ds.FinancialYearSummary;
import com.sid.tutorials.spring.module01.writer.FinancialReportWriter;

@Component
class SimpleFinancialReportService {
	private final FinancialDataDao financialDataDao;
	private final FinancialReportWriter financialReportWriter;

	SimpleFinancialReportService(@Autowired FinancialDataDao financialDataDao,
			@Autowired FinancialReportWriter financialReportWriter) {
		this.financialDataDao = financialDataDao;
		this.financialReportWriter = financialReportWriter;
	}

	public void generateReport() {
		FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2019);
		FinancialQuarterSummary financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2019, 1);
		FinancialMonthSummary financialMonthSummary = financialDataDao.findFinancialMonthSummary(2019, 4);

		financialReportWriter.appendFreeText("Year / Quarter / Month Financial Report");
		financialReportWriter.appendFinancialYearSummary(financialYearSummary);
		financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
		financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
	}
}
