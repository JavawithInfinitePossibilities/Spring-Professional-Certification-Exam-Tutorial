package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module03.service.EmployeesService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	EmployeesService employeesService;

	@Test
	void test() {
		employeesService.saveEmployeeWithoutTransaction();
		employeesService.saveEmployeeInTransaction();
	}

}
