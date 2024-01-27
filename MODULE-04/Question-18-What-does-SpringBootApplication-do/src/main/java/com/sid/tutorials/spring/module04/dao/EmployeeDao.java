package com.sid.tutorials.spring.module04.dao;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.spring.module04.ds.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
