package com.sid.tutorials.spring.module03.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.spring.module03.dao.EmployeeDao;
import com.sid.tutorials.spring.module03.ds.Employee;

@Service
public class EmployeesService {

	@Autowired
	private EmployeeDao employeeDao;

	public void saveEmployeeWithoutTransaction() {
		employeeDao.saveEmployee(
				new Employee(1, "John", "Doe", "John.Doe@corp.com", "555-55-55", Date.valueOf("2019-06-05"), 70000));
	}

	@Transactional
	public void saveEmployeeInTransaction() {
		employeeDao.saveEmployee(
				new Employee(1, "John", "Doe", "John.Doe@corp.com", "555-55-55", Date.valueOf("2019-06-05"), 70000));
	}
}
