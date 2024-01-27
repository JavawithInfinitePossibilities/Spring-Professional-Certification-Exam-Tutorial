package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.ds.Employee;
import com.sid.tutorials.spring.module01.service.a.EmployeeRepository;
import com.sid.tutorials.spring.module01.service.b.AlternateEmployeeRepository;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        AlternateEmployeeRepository alternateEmployeeRepository = context.getBean(AlternateEmployeeRepository.class);

        Employee employee = employeeRepository.findEmployeeById(5);
        employeeRepository.saveEmployee(employee);
        employeeRepository.deleteEmployee(employee);

        alternateEmployeeRepository.findEmployeeById(5);
        alternateEmployeeRepository.saveEmployee(employee);
        alternateEmployeeRepository.deleteEmployee(employee);
	}

}
