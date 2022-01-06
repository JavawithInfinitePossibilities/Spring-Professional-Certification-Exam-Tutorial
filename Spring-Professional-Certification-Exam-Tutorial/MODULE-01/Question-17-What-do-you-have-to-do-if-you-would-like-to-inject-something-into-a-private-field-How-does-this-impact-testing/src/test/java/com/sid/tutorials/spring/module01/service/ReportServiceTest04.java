package com.sid.tutorials.spring.module01.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.ds.Report;
import com.sid.tutorials.spring.module01.writer.ReportWriter;
@SpringBootTest(classes = Runner.class)
@TestPropertySource(properties = "report.global.name=Test_Report_04")
class ReportServiceTest04 {
	static final String REPORT_NAME = "Mock_Report";

    @Autowired
    private ReportService reportService;
    @MockBean
    private ReportWriter reportWriter;

    @Test
    public void shouldPassReportToWriter() {
        reportService.execute();
        verify(reportWriter).write(any(Report.class), eq(REPORT_NAME));
    }
}
