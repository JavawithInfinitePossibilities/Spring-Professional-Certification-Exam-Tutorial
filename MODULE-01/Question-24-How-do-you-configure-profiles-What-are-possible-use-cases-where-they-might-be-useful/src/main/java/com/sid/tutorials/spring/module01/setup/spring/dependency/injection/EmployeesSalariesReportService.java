package com.sid.tutorials.spring.module01.setup.spring.dependency.injection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.beans.Employee;
import com.sid.tutorials.spring.module01.beans.EmployeeSalary;
import com.sid.tutorials.spring.module01.dao.EmployeeDao;
import com.sid.tutorials.spring.module01.setup.commons.bls.EmployeeSalaryCalculator;
import com.sid.tutorials.spring.module01.setup.commons.report.SalaryReport;

@Service("employeesSalariesReportServiceSpringDependencyInjection")
public class EmployeesSalariesReportService {
	private final EmployeeDao employeeDao;
	private final EmployeeSalaryCalculator employeeSalaryCalculator;
	private final SalaryReport salaryReport;

	public EmployeesSalariesReportService(@Autowired EmployeeDao employeeDao,
			@Autowired EmployeeSalaryCalculator employeeSalaryCalculator, @Autowired SalaryReport salaryReport) {
		this.employeeDao = employeeDao;
		this.employeeSalaryCalculator = employeeSalaryCalculator;
		this.salaryReport = salaryReport;
	}

	public void generateReport() {
		List<Employee> employees = employeeDao.findAll();
		List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);
		this.salaryReport.writeReport(employeeSalaries);
	}
}
