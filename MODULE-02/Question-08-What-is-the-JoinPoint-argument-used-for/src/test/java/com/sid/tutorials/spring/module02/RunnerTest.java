package com.sid.tutorials.spring.module02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module02.beans.HelloBean;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		HelloBean helloBean = context.getBean(HelloBean.class);
		helloBean.formatData("John", "Doe");
		try {
			helloBean.saveData(null);
		} catch (Exception ignored) {
			// ignored on purpose
		}
	}

}
