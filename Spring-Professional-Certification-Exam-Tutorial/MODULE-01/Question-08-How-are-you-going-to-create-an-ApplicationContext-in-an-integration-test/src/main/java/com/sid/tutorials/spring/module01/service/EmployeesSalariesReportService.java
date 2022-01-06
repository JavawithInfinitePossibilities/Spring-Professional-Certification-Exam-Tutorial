package com.sid.tutorials.spring.module01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.bls.EmployeeSalaryCalculator;
import com.sid.tutorials.spring.module01.dao.EmployeeDao;
import com.sid.tutorials.spring.module01.ds.Employee;
import com.sid.tutorials.spring.module01.ds.EmployeeSalary;
import com.sid.tutorials.spring.module01.report.SalaryReport;

@Service
public class EmployeesSalariesReportService {
	private final EmployeeDao employeeDao;
	private final EmployeeSalaryCalculator employeeSalaryCalculator;
	private final SalaryReport salaryReport;

	EmployeesSalariesReportService(EmployeeDao employeeDao, EmployeeSalaryCalculator employeeSalaryCalculator,
			SalaryReport salaryReport) {
		this.employeeDao = employeeDao;
		this.employeeSalaryCalculator = employeeSalaryCalculator;
		this.salaryReport = salaryReport;
	}

	public void generateReport() {
		List<Employee> employees = employeeDao.findAll();
		List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

		salaryReport.writeReport(employeeSalaries);
	}
}
