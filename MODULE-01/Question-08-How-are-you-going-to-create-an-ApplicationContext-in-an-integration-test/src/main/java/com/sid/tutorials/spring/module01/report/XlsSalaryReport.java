package com.sid.tutorials.spring.module01.report;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.EmployeeSalary;

@Component
public class XlsSalaryReport implements SalaryReport {
	public void writeReport(List<EmployeeSalary> employeeSalaries) {
		System.out.println("Writing Xls Report");
	}
}
