package com.sid.tutorials.spring.module01.setup.commons.report;

import java.util.List;

import com.sid.tutorials.spring.module01.setup.commons.ds.EmployeeSalary;

public interface SalaryReport {
    void writeReport(List<EmployeeSalary> employeeSalaries);
}
