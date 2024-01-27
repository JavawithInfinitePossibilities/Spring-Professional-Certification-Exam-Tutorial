package com.sid.tutorials.spring.module03.dao;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.spring.module03.ds.Employee;
import com.sid.tutorials.spring.module03.ds.EmployeeKey;

public interface EmployeeDao extends CrudRepository<Employee, EmployeeKey> {
}
