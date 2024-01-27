package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.annotations.beans.SpringBean1;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		SpringBean1 springBean1 = context.getBean(SpringBean1.class);
		springBean1.sayHello();
	}

}
