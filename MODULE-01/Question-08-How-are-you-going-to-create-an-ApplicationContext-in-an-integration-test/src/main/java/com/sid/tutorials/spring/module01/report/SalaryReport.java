package com.sid.tutorials.spring.module01.report;

import java.util.List;

import com.sid.tutorials.spring.module01.ds.EmployeeSalary;

public interface SalaryReport {
    void writeReport(List<EmployeeSalary> employeeSalaries);
}
