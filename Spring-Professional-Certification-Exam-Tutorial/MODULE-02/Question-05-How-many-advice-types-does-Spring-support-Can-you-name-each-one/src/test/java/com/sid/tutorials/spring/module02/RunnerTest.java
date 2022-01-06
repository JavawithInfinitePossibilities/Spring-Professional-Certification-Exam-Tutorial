package com.sid.tutorials.spring.module02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module02.repository.EmployeeRepository;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		repository.findEmployeeById(5);
		try {
			repository.findEmployeeById(-1);
		} catch (Exception ignored) {
		}
	}

}
