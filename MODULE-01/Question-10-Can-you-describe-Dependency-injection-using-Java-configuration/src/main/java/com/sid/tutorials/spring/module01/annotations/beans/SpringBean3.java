package com.sid.tutorials.spring.module01.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean3 {
	public SpringBean3() {
		System.out.println(getClass().getSimpleName() + "::constructor");
	}
}
