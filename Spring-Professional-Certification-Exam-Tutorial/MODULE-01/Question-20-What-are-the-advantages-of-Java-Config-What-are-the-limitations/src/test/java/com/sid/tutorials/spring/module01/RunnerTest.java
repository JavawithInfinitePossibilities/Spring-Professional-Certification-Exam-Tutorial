package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module01.beans.SpringBean1;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	SpringBean1 bean1;

	@Test
	void test() {
		bean1.printDependencies();
	}

}
