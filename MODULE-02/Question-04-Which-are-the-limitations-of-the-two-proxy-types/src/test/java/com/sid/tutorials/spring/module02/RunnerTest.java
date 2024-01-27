package com.sid.tutorials.spring.module02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module02.service.a.EmployeeRepository;
import com.sid.tutorials.spring.module02.service.b.AlternateEmployeeRepository;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		AlternateEmployeeRepository alternateEmployeeRepository = context.getBean(AlternateEmployeeRepository.class);
		SamePackageEmployeeRepository samePackageEmployeeRepository = context
				.getBean(SamePackageEmployeeRepository.class);

		// employeeRepository.findAndUpdateEmployeeById(5, new Employee());
		// employeeRepository.findEmployeeById(5);
		// employeeRepository.saveEmployee(new Employee());
		// employeeRepository.deleteEmployee(new Employee());

		// Method deleteByEmail =
		// employeeRepository.getClass().getDeclaredMethod("deleteByEmail",
		// String.class);
		// deleteByEmail.setAccessible(true);
		// deleteByEmail.invoke(samePackageEmployeeRepository, "john@corp.net");

		// alternateEmployeeRepository.findAndUpdateEmployeeById(5, new Employee());
		// alternateEmployeeRepository.findEmployeeById(5);
		// alternateEmployeeRepository.saveEmployee(new Employee());
		// alternateEmployeeRepository.deleteEmployee(new Employee());

		// samePackageEmployeeRepository.saveEmployee(new Employee());
		// samePackageEmployeeRepository.deleteEmployee(5);
		// samePackageEmployeeRepository.deleteEmployeeByEmail("john@corp.net");

		// Method deleteEmployeeByPhone =
		// samePackageEmployeeRepository.getClass().getSuperclass().getDeclaredMethod("deleteEmployeeByPhone",
		// String.class);
		// deleteEmployeeByPhone.setAccessible(true);
		// deleteEmployeeByPhone.invoke(samePackageEmployeeRepository, "202-555-0140");
	}

}
