package com.sid.tutorials.spring.module01.service.a;

import com.sid.tutorials.spring.module01.ds.Employee;

public interface EmployeeRepository {
	Employee findEmployeeById(long id);

	void saveEmployee(Employee employee);

	void deleteEmployee(Employee employee);

}
