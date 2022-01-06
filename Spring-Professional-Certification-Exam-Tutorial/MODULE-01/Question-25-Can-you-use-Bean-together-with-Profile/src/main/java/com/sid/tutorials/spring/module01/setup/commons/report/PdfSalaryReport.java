package com.sid.tutorials.spring.module01.setup.commons.report;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.beans.EmployeeSalary;

@Component
@Profile("pdf-reports")
public class PdfSalaryReport implements SalaryReport {
	public void writeReport(List<EmployeeSalary> employeeSalaries) {
		System.out.println("Writing Pdf Report");
	}
}
