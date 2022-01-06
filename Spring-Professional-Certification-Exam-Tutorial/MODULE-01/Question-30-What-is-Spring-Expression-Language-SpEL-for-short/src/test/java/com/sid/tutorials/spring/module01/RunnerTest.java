package com.sid.tutorials.spring.module01;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;

import com.sid.tutorials.spring.module01.bean.SpringBean;
import com.sid.tutorials.spring.module01.bean.SpringBean1;
import com.sid.tutorials.spring.module01.bean.SpringBean2;

@SpringBootTest(classes = Runner.class)
@TestPropertySource(locations = "classpath:./application.properties",properties = "app.tax.department.name=IT")
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	SpringBean1 springBean1;

	@Autowired
	SpringBean2 springBean2;
	
	@Disabled
	@Test
	void test() {
		SpringBean springBean = context.getBean(SpringBean.class);
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

	

	@Test
	void test2() {
		System.out.println("getName = " + springBean1.getName());
		System.out.println("getStreetName = " + springBean1.getStreetName());
		System.out.println("isAccountExists = " + springBean1.isAccountExists());
		System.out.println("getIdNumber = " + springBean1.getIdNumber());
		System.out.println("getAccountBalance = " + springBean1.getAccountBalance());
		System.out.println("getDepartmentId = " + springBean1.getDepartmentId());
		System.out.println("getDepartmentName = " + springBean1.getDepartmentName());
		System.out.println("getManagerName = " + springBean1.getManagerName());
		System.out.println("getSupportContactMail = " + springBean1.getSupportContactMail());
		System.out.println("getSupportPhone = " + springBean1.getSupportPhone());
		System.out.println("getSupportAddress = " + springBean1.getSupportAddress());
		System.out.println("getDependentDepartments = " + Arrays.toString(springBean1.getDependentDepartments()));
		System.out.println("getCasesIds = " + springBean1.getCasesIds());
		System.out.println("getCasesSet = " + springBean1.getCasesSet());
		System.out.println("getCasesMap = " + springBean1.getCasesMap());
		System.out.println("getTaxId = " + springBean1.getTaxId());

		System.out.println("getTaxValue = " + springBean2.getTaxValue());
		System.out.println("getTaxDepartmentName = " + springBean2.getTaxDepartmentName());
		System.out.println("getTaxDepartmentAlternateName = " + springBean2.getTaxDepartmentAlternateName());
	}

}
