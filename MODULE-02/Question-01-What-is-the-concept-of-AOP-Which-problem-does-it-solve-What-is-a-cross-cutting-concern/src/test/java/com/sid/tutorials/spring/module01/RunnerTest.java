package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.with.aop.actions.ComplexReportAction;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		ComplexReportAction complexReportAction = context.getBean(ComplexReportAction.class);
        try {
			complexReportAction.perform();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
