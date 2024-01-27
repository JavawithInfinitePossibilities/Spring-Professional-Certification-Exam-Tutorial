package com.sid.tutorials.spring.module01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.sid.tutorials.spring.module01.beans.SpringBean7;
import com.sid.tutorials.spring.module01.beans.SpringBean8;

@Configuration
@Lazy(value = false)
public class ApplicationConfiguration {
	//
	@Lazy(true)
	@Bean
	public SpringBean7 springBean7() {
		return new SpringBean7();
	}

	@Bean
	public SpringBean8 springBean8() {
		return new SpringBean8();
	}

}
