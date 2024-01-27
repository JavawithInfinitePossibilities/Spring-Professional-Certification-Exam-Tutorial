package com.sid.tutorials.spring.module01.proxy.cglib;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Enhancer;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.dao.DepartmentDao;
import com.sid.tutorials.spring.module01.ds.Department;

@SpringBootTest(classes = Runner.class)
class DepartmentDaoMethodInterceptorTest {

	@Test
	void test() {
		Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new DepartmentDaoMethodInterceptor());
        enhancer.setSuperclass(DepartmentDao.class);
        DepartmentDao departmentDao = (DepartmentDao) enhancer.create();

        Department department = departmentDao.findById(5);
        departmentDao.save(department);
	}

}
