package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module04.Runner;
import com.sid.tutorials.spring.module04.dao.EmployeeDao;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void test() {
		System.out.println("Fetching employees...");
		employeeDao.findAll().forEach(System.out::println);
	}

}
