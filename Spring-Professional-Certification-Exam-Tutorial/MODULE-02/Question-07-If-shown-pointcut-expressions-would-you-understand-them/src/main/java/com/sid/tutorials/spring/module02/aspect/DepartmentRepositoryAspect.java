package com.sid.tutorials.spring.module02.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DepartmentRepositoryAspect {

	@Before("@within(com.sid.tutorials.spring.module02.annotation.MonitoredRepository)")
	public void annotationWithinExample() {
		System.out.println("Before - annotationWithinExample");
	}

	/*
	 * @Before(
	 * "@target(com.sid.tutorials.spring.module02.annotation.MonitoredRepository)")
	 * public void annotationTargetExample() {
	 * System.out.println("Before - annotationTargetExample"); }
	 */

}
