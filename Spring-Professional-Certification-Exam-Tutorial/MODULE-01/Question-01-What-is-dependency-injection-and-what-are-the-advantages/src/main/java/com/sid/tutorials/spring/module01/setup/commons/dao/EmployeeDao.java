package com.sid.tutorials.spring.module01.setup.commons.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.setup.commons.ds.Employee;

@Component
public class EmployeeDao {
	public List<Employee> findAll() {
		System.out.println("Finding all employees");
		return Collections.emptyList();
	}
}
