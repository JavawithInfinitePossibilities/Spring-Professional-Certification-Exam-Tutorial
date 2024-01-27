package com.sid.tutorials.spring.module01;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import com.sid.tutorials.spring.module01.bean.SpringBean;

@SpringBootTest(classes = Runner.class)
@TestPropertySource(locations = "classpath:./application.properties")
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	SpringBean springBean;

	@Test
	void test() {
		//SpringBean springBean = context.getBean(SpringBean.class);
		System.out.println("getName = " + springBean.getName());
		System.out.println("getStreetName = " + springBean.getStreetName());
		System.out.println("isAccountExists = " + springBean.isAccountExists());
		System.out.println("getIdNumber = " + springBean.getIdNumber());
		System.out.println("getAccountBalance = " + springBean.getAccountBalance());
		System.out.println("getDepartmentId = " + springBean.getDepartmentId());
		System.out.println("getDepartmentName = " + springBean.getDepartmentName());
		System.out.println("getManagerName = " + springBean.getManagerName());
		System.out.println("getSupportContactMail = " + springBean.getSupportContactMail());
		System.out.println("getSupportPhone = " + springBean.getSupportPhone());
		System.out.println("getSupportAddress = " + springBean.getSupportAddress());
		System.out.println("getDependentDepartments = " + Arrays.toString(springBean.getDependentDepartments()));
		System.out.println("getCasesIds = " + springBean.getCasesIds());
		System.out.println("getCasesSet = " + springBean.getCasesSet());
		System.out.println("getCasesMap = " + springBean.getCasesMap());
	}

}
