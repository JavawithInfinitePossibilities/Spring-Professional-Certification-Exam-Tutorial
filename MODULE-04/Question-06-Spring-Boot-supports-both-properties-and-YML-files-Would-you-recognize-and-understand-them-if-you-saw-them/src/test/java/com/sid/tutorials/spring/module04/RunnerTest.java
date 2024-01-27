package com.sid.tutorials.spring.module04;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module04.configuration.ApplicationConfiguration;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	private ApplicationConfiguration applicationConfiguration;

	@Test
	void test() {
		System.out.println("Configuration injected from properties:");
		System.out.println(applicationConfiguration);
	}

}
