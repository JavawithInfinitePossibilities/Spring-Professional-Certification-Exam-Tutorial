package com.sid.tutorials.spring.module01.setup.no.dependency.injection;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module01.setup.commons.bls.EmployeeSalaryCalculator;
import com.sid.tutorials.spring.module01.setup.commons.dao.EmployeeDao;
import com.sid.tutorials.spring.module01.setup.commons.ds.Employee;
import com.sid.tutorials.spring.module01.setup.commons.ds.EmployeeSalary;
import com.sid.tutorials.spring.module01.setup.commons.report.PdfSalaryReport;
import com.sid.tutorials.spring.module01.setup.commons.report.SalaryReport;

@Service("employeesSalariesReportServicenodependencyinjection")
public class EmployeesSalariesReportService {
	public void generateReport() {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> employees = employeeDao.findAll();

		EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
		List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

		SalaryReport salaryReport = new PdfSalaryReport();
		salaryReport.writeReport(employeeSalaries);
	}
}
