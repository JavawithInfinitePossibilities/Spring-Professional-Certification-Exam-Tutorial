package com.sid.tutorials.spring.module03.repositories;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sid.tutorials.spring.module03.model.db.Employee;

@Repository
public class JdbcEmployeeDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Employee employee) {
		jdbcTemplate.update(
				"insert into employee(employee_id, first_name, last_name, email, phone_number, hire_date, salary) "
						+ "values (?, ?, ?, ?, ?, ?, ?)",
				employee.getEmployee_id(), employee.getName(), employee.getLastName(), employee.getEmail(),
				employee.getPhone_number(), employee.getHire_date(), employee.getSalary());
	}
}
