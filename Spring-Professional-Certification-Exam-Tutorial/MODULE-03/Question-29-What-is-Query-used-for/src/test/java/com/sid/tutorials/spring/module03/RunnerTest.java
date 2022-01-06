package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module03.service.EmployeeService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	EmployeeService employeeService;

	@Test
	void test() {
		// employeeService.saveEmployeesUnderOneTransaction();
		employeeService.listAllEmployees();
		employeeService.listSelectedEmployees();
		employeeService.queryEmployee();
	}

}
