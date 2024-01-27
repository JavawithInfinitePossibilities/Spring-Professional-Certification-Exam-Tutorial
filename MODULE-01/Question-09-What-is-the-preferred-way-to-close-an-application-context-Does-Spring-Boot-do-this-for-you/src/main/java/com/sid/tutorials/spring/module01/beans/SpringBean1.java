package com.sid.tutorials.spring.module01.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {

	public void sayHello() {
		System.out.println("Hello");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy " + getClass().getSimpleName());
	}
}
