package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module03.service.EmployeeReportService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	EmployeeReportService employeesService;

	@Test
	void test() {

		try {
			employeesService.saveEmployeesWithoutTransaction();
		} catch (Exception e) {
			System.out.println("Exception during saving employees: " + e.getMessage());
		}
		employeesService.printEmployees();
		employeesService.printReportInTransaction();
		employeesService.deleteAllEmployees();

		try {
			employeesService.saveEmployeesInTransaction();
		} catch (Exception e) {
			System.out.println("Exception during saving employees: " + e.getMessage());
		}
		employeesService.printEmployees();
		employeesService.printReportInTransaction();
		employeesService.deleteAllEmployees();

	}

}
