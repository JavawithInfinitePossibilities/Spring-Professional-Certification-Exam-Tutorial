package com.sid.tutorials.spring.module03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module03.service.EmployeeService;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		EmployeeService employeeService = context.getBean(EmployeeService.class);

        employeeService.callRequiredWithoutCurrentTransaction();
        employeeService.callRequiredWithCurrentTransaction();

        employeeService.callSupportsWithoutCurrentTransaction();
        employeeService.callSupportsWithCurrentTransaction();

        employeeService.callMandatoryWithoutCurrentTransaction();
        employeeService.callMandatoryWithCurrentTransaction();

        employeeService.callRequiresNewWithoutCurrentTransaction();
        employeeService.callRequiresNewWithCurrentTransaction();

        employeeService.callNotSupportedWithoutCurrentTransaction();
        employeeService.callNotSupportedWithCurrentTransaction();

        employeeService.callNeverWithoutCurrentTransaction();
        employeeService.callNeverWithCurrentTransaction();

        employeeService.callNestedWithoutCurrentTransaction();
        employeeService.callNestedWithCurrentTransaction();
	}

}
