package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module03.service.EmployeeReportService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	EmployeeReportService employeeReportService;

	@Test
	void test() {
		employeeReportService.printReport();
	}

}
