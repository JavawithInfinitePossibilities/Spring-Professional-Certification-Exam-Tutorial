package com.sid.tutorials.spring.module02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeRepositoryAspect {
	@Pointcut("within(com.sid.tutorials.spring.module02.service.*.*) || within(com.sid.tutorials.spring.module02.*)")
	public void serviceOrSamePackageRepository() {
	}

	@Before("serviceOrSamePackageRepository()")
	public void before(JoinPoint joinPoint) {
		System.out.println("before - " + joinPoint.getSignature());
	}

	@After("serviceOrSamePackageRepository()")
	public void after(JoinPoint joinPoint) {
		System.out.println("after - " + joinPoint.getSignature());
	}
}
