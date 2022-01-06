package com.sid.tutorials.spring.module04;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	private ServerConfiguration serverConfiguration;

	@Test
	void test() {
		System.out.println(serverConfiguration);
	}

}
