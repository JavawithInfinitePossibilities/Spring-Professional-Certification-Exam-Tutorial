package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module03.dao.EmployeeDao;
import com.sid.tutorials.spring.module03.service.EmployeeService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		EmployeeService employeeService = context.getBean(EmployeeService.class);
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        try {
            employeeService.operationsWithAutoCommit();
        } catch (Exception e) {
            System.err.println(String.format("Exception occurred: %s: %s", e.getClass().getSimpleName(), e.getMessage()));
        }
        employeeService.findAllEmployees();
        employeeDao.deleteAllEmployees();
        System.out.println("\n\n");
        try {
            employeeService.operationsWithoutAutoCommit();
        } catch (Exception e) {
            System.err.println(String.format("Exception occurred: %s: %s", e.getClass().getSimpleName(), e.getMessage()));
        }
        employeeService.findAllEmployees();
	}

}
