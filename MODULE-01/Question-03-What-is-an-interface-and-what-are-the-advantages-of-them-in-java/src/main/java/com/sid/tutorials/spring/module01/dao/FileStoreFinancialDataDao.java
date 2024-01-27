package com.sid.tutorials.spring.module01.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.FinancialMonthSummary;
import com.sid.tutorials.spring.module01.ds.FinancialQuarterSummary;
import com.sid.tutorials.spring.module01.ds.FinancialYearSummary;

@Component("file-dao")
@Primary
public class FileStoreFinancialDataDao implements FinancialDataDao {
	@Override
	public FinancialYearSummary findFinancialYearSummary(int year) {
		System.out.println("File Dao => findFinancialYearSummary");
		return new FinancialYearSummary();
	}

	@Override
	public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
		System.out.println("File Dao => findFinancialQuarterSummary");
		return new FinancialQuarterSummary();
	}

	@Override
	public FinancialMonthSummary findFinancialMonthSummary(int year, int month) {
		System.out.println("File Dao => findFinancialMonthSummary");
		return new FinancialMonthSummary();
	}
}
