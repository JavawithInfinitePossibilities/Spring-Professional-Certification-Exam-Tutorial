package com.sid.tutorials.spring.module01.beans;

import org.springframework.stereotype.Service;

@Service
public class ServiceBean {
	public ServiceBean() {
		System.out.println(getClass().getSimpleName() + "::constructor");
	}
}
