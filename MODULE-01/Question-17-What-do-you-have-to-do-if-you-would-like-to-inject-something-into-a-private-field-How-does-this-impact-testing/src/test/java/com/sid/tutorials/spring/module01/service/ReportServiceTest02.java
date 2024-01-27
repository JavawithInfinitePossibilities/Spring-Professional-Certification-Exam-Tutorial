package com.sid.tutorials.spring.module01.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.ds.Report;
import com.sid.tutorials.spring.module01.writer.ReportWriter;

/*@SpringBootTest(classes = Runner.class)*/
@ExtendWith(MockitoExtension.class) 
class ReportServiceTest02 {

	@InjectMocks
	private ReportService reportService;
	@Mock
	private ReportWriter reportWriter;

	@Test
	public void shouldPassReportToWriter() {
		reportService.execute();
		verify(reportWriter).write(any(Report.class), any());
	}

}
