package com.sid.tutorials.spring.module02;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module02.beans.DepartmentRepository;
import com.sid.tutorials.spring.module02.beans.EmployeeBean;
import com.sid.tutorials.spring.module02.beans.HelloChildBean;
import com.sid.tutorials.spring.module02.beans.ITaxBean;
import com.sid.tutorials.spring.module02.beans.TaxBean2;
import com.sid.tutorials.spring.module02.ds.Department;
import com.sid.tutorials.spring.module02.ds.Person;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() throws IOException {
		HelloChildBean springBean = context.getBean(HelloChildBean.class);
        springBean.sayHello("John", 5);
        springBean.validateName("Jane");
        springBean.saveCounterValue(7);
        springBean.savePerson(new Person());

        ITaxBean taxBean1 = context.getBean(ITaxBean.class);
        TaxBean2 taxBean2 = context.getBean(TaxBean2.class);
        taxBean1.calculateTax(5f);
        taxBean2.calculateTax(10f);

        DepartmentRepository departmentRepository = context.getBean(DepartmentRepository.class);
        Department department = departmentRepository.findDepartment("DEPA%");
        departmentRepository.updateDepartment(5, department);

        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setId(5);
        employeeBean.setCubicId("A-105");
        employeeBean.setName("John");
        employeeBean.setWorkPhone("18885555");
        employeeBean.getId();
        employeeBean.getCubicId();
        employeeBean.getName();
        employeeBean.getWorkPhone();
	}

}
