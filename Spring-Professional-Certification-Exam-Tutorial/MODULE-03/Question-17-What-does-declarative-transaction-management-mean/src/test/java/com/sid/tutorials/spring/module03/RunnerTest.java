package com.sid.tutorials.spring.module03;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module03.service.EmployeeService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() throws SQLException {
		EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.declarativeTransaction();
        employeeService.manualTransaction();
	}

}
