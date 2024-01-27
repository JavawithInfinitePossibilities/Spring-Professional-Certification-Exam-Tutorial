package com.sid.tutorials.spring.module03.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.spring.module03.model.db.Employee;
import com.sid.tutorials.spring.module03.repositories.IEmployeeRepo;
import com.sid.tutorials.spring.module03.repositories.JdbcEmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	private IEmployeeRepo jpaEmployeeDao;
	@Autowired
	private JdbcEmployeeDao jdbcEmployeeDao;

	@Transactional
	public void saveEmployeesUnderOneTransaction() {
		System.out.println("Saving all employees...");
		System.out.println("Saving employee with JPA...");
		jpaEmployeeDao.save(Employee.builder().employee_id(1).name("Siddhant").lastName("Sahu").email("email@gmail.com")
				.phone_number("123456789").hire_date(LocalDate.of(2011, 8, 23)).salary(1000).build());
		System.out.println("Saved employee with JPA");
		System.out.println("Saving employee with JDBC...");
		jdbcEmployeeDao
				.save(Employee.builder().employee_id(2).name("Siddhant").lastName("Sahu").email("email@gmail.com")
						.phone_number("123456789").hire_date(LocalDate.of(2011, 8, 23)).salary(1000).build());
		System.out.println("Saved employee with JDBC");

		System.out.println("Saved all employees");
	}

	@Transactional
	public void listAllEmployees() {
		System.out.println("Listing all employees...");
		jpaEmployeeDao.findAll().forEach(System.out::println);
	}
}
