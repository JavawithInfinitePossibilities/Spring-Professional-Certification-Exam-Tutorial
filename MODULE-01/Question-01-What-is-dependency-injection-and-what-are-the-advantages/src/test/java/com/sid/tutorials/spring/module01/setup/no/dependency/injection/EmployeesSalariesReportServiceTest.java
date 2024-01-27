package com.sid.tutorials.spring.module01.setup.no.dependency.injection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.sid.tutorials.spring.module01.setup.Runner;

@SpringBootTest(classes = Runner.class)
@ActiveProfiles("pdf-reports")
class EmployeesSalariesReportServiceTest {

	@Autowired
	@Qualifier("employeesSalariesReportServicenodependencyinjection")
	private EmployeesSalariesReportService employeesSalariesReportService;

	@Test
	void test() {
		employeesSalariesReportService.generateReport();
	}

}
