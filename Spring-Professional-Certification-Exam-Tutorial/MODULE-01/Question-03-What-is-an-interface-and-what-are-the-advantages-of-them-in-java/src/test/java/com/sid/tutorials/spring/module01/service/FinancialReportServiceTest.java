package com.sid.tutorials.spring.module01.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.Runner;

@SpringBootTest(classes = Runner.class)
class FinancialReportServiceTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		FinancialReportService service = context.getBean(FinancialReportService.class);
		service.generateReport();
	}

}
