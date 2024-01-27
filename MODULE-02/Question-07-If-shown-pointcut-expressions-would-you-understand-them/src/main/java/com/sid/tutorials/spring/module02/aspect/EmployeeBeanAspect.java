package com.sid.tutorials.spring.module02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeBeanAspect {

	@Before("execution(* com.sid.tutorials.spring.module02.beans.EmployeeBean.get*()) || execution(* com.sid.tutorials.spring.module02.beans.EmployeeBean.set*(*))")
	public void beforeGetterOrSetter(JoinPoint joinPoint) {
		System.out.println("beforeGetterOrSetter " + joinPoint.getSignature());
	}

}
