/**
 * 
 */
package com.sid.tutorials.spring.module01.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sid.tutorials.spring.module01.setup.commons.bls.EmployeeSalaryCalculator;
import com.sid.tutorials.spring.module01.setup.commons.dao.EmployeeDao;
import com.sid.tutorials.spring.module01.setup.commons.report.SalaryReport;
import com.sid.tutorials.spring.module01.setup.manual.dependency.injection.EmployeesSalariesReportServiceManualDependencyInjection;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
public class Runner {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	EmployeeSalaryCalculator employeeSalaryCalculator;

	@Autowired
	SalaryReport report;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

	@Bean("employeesSalariesReportServiceManualDependencyInjection")
	public EmployeesSalariesReportServiceManualDependencyInjection employeesSalariesReportServiceManualDependencyInjection() {
		return new EmployeesSalariesReportServiceManualDependencyInjection(employeeDao, employeeSalaryCalculator,
				report);
	}

}
