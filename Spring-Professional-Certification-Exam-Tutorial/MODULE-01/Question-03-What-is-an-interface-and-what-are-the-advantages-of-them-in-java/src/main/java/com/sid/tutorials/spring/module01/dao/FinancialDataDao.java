package com.sid.tutorials.spring.module01.dao;

import com.sid.tutorials.spring.module01.ds.FinancialMonthSummary;
import com.sid.tutorials.spring.module01.ds.FinancialQuarterSummary;
import com.sid.tutorials.spring.module01.ds.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
