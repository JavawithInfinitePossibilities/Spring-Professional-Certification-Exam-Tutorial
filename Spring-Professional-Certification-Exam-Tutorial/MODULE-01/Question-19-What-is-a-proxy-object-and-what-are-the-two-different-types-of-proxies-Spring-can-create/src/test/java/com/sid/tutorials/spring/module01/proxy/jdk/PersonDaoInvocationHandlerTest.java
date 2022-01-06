package com.sid.tutorials.spring.module01.proxy.jdk;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.dao.PersonDao;
import com.sid.tutorials.spring.module01.dao.PersonDaoImpl;
import com.sid.tutorials.spring.module01.ds.Person;

@SpringBootTest(classes = Runner.class)
class PersonDaoInvocationHandlerTest {

	@Test
	void test() {
		PersonDao personDao = (PersonDao) Proxy.newProxyInstance(PersonDao.class.getClassLoader(),
				PersonDaoImpl.class.getInterfaces(), new PersonDaoInvocationHandler(new PersonDaoImpl()));
		Person person = personDao.findById(5);
		personDao.save(person);
	}

}
