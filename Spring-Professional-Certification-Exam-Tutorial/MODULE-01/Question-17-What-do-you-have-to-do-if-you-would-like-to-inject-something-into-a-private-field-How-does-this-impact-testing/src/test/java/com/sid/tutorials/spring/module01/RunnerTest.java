package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import com.sid.tutorials.spring.module01.service.ReportService;

@SpringBootTest(classes = Runner.class)
@TestPropertySource(locations = "classpath:./application.properties")
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	ReportService reportService;

	@Test
	void test() {
		// ReportService reportService = context.getBean(ReportService.class);
		reportService.execute();
	}

}
