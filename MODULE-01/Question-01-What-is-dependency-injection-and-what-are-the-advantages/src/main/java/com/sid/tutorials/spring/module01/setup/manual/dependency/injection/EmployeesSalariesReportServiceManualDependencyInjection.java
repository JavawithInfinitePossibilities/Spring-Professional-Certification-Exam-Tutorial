package com.sid.tutorials.spring.module01.setup.manual.dependency.injection;

import java.util.List;

import com.sid.tutorials.spring.module01.setup.commons.bls.EmployeeSalaryCalculator;
import com.sid.tutorials.spring.module01.setup.commons.dao.EmployeeDao;
import com.sid.tutorials.spring.module01.setup.commons.ds.Employee;
import com.sid.tutorials.spring.module01.setup.commons.ds.EmployeeSalary;
import com.sid.tutorials.spring.module01.setup.commons.report.SalaryReport;

public class EmployeesSalariesReportServiceManualDependencyInjection {
	private final EmployeeDao employeeDao;
	private final EmployeeSalaryCalculator employeeSalaryCalculator;
	private final SalaryReport salaryReport;

	public EmployeesSalariesReportServiceManualDependencyInjection(EmployeeDao employeeDao,
			EmployeeSalaryCalculator employeeSalaryCalculator, SalaryReport report) {
		this.employeeDao = employeeDao;
		this.employeeSalaryCalculator = employeeSalaryCalculator;
		this.salaryReport = report;
	}

	public void generateReport() {
		List<Employee> employees = employeeDao.findAll();
		List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);
		salaryReport.writeReport(employeeSalaries);
	}
}
