package com.sid.tutorials.spring.module01.with.aop.aspects;

import java.time.Duration;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceLoggerAspect {

	private Logger logger = Logger.getLogger("performance.logger");

	@Around("@annotation(com.sid.tutorials.spring.module01.with.aop.annotations.PerformanceLogger)")
	public Object logPerformance(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		try {
			return proceedingJoinPoint.proceed();
		} finally {
			long finishTime = System.currentTimeMillis();
			Duration duration = Duration.ofMillis(finishTime - startTime);

			logger.info(String.format("Duration of %s execution was %s", proceedingJoinPoint.getSignature(), duration));
		}
	}
}
