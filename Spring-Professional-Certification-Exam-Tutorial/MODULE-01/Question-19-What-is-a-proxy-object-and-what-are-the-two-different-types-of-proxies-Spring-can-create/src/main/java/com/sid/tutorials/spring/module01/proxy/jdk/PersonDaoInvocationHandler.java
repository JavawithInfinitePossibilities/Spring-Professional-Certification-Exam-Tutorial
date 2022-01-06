package com.sid.tutorials.spring.module01.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.dao.PersonDao;

@Component
public class PersonDaoInvocationHandler implements InvocationHandler {

	private final PersonDao target;

	public PersonDaoInvocationHandler(@Qualifier("personDaoImpl") PersonDao target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("before " + method.getName());
		Object result = method.invoke(target, args);
		System.out.println("after " + method.getName());
		return result;
	}
}
