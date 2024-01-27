package com.sid.tutorials.spring.module01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Report;
import com.sid.tutorials.spring.module01.writer.ReportWriter;

public class ReportService {

	@Autowired
	private ReportWriter reportWriter;

	@Value("${report.global.name}")
	private String reportGlobalName;

	public void execute() {
		Report report = new Report();

		// ...
		System.out.println("reportGlobalName : " + this.reportGlobalName);
		reportWriter.write(report, reportGlobalName);
	}
}
