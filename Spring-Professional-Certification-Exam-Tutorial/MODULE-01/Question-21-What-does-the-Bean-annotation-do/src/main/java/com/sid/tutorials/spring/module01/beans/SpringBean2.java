package com.sid.tutorials.spring.module01.beans;

public class SpringBean2 {
	private void destroy() {
		System.out.println(getClass().getSimpleName() + "::destroy()");
	}
}
