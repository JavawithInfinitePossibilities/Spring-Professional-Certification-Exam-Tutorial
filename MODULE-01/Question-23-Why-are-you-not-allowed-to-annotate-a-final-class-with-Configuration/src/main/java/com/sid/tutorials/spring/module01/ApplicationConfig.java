package com.sid.tutorials.spring.module01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sid.tutorials.spring.module01.beans.SpringBean1;
import com.sid.tutorials.spring.module01.beans.SpringBean2;

@Configuration
public class ApplicationConfig {
	@Bean
	public SpringBean1 springBean1() {
		System.out.println("Creating Bean " + SpringBean1.class.getSimpleName());
		return new SpringBean1();
	}

	@Bean
	@Scope("prototype")
	public SpringBean2 springBean2() {
		System.out.println("Creating Bean " + SpringBean2.class.getSimpleName());
		return new SpringBean2();
	}
}
