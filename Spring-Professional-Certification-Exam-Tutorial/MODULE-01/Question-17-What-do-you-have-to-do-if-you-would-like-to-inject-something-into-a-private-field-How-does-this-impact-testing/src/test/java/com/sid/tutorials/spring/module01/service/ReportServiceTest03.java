package com.sid.tutorials.spring.module01.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.ds.Report;
import com.sid.tutorials.spring.module01.writer.ReportWriter;
@SpringBootTest(classes = Runner.class)
class ReportServiceTest03 {

	private ReportService reportService;

    @BeforeAll
    public void setUp() {
        reportService = new ReportService();
    }

    @Test
    public void shouldPassReportToWriter() {
        ReportWriter reportWriter = Mockito.mock(ReportWriter.class);
        ReflectionTestUtils.setField(reportService, ReportService.class, "reportWriter", reportWriter, ReportWriter.class);
        reportService.execute();
        verify(reportWriter).write(any(Report.class), any());
    }

}
