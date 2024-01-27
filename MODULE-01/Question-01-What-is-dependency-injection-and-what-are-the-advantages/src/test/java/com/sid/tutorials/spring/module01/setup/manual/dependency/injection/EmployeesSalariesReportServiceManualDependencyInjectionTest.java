package com.sid.tutorials.spring.module01.setup.manual.dependency.injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.sid.tutorials.spring.module01.setup.Runner;

@SpringBootTest(classes = Runner.class)
@ActiveProfiles("pdf-reports")
class EmployeesSalariesReportServiceManualDependencyInjectionTest {

	@Autowired
	private EmployeesSalariesReportServiceManualDependencyInjection employeesSalariesReportService;

	@Test
	void test() {
		employeesSalariesReportService.generateReport();
	}

}
