package com.sid.tutorials.spring.module03;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.spring.module03.model.db.Employee;
import com.sid.tutorials.spring.module03.repositories.IEmployeeRepo;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Test
	@Transactional
	@Rollback(false)
	void test() {
		Employee employee = Employee.builder().employee_id(1).name("Siddhant").lastName("Sahu").email("email@gmail.com")
				.phone_number("123456789").hire_date(LocalDate.of(2011, 8, 23)).salary(1000).build();
		iEmployeeRepo.save(employee);
		Employee employee2 = Employee.builder().employee_id(2).name("Siddhant").lastName("Sahu")
				.email("email@gmail.com").phone_number("123456789").hire_date(LocalDate.of(2011, 8, 23)).salary(1000)
				.build();
		iEmployeeRepo.save(employee2);
		Employee employee3 = Employee.builder().employee_id(3).name("Siddhant").lastName("Sahu")
				.email("email@gmail.com").phone_number("123456789").hire_date(LocalDate.of(2011, 8, 23)).salary(1000)
				.build();
		iEmployeeRepo.save(employee3);
		Employee employee4 = Employee.builder().employee_id(4).name("Siddhant").lastName("Sahu")
				.email("email@gmail.com").phone_number("123456789").hire_date(LocalDate.of(2011, 8, 23)).salary(1000)
				.build();
		iEmployeeRepo.save(employee4);
	}

}
