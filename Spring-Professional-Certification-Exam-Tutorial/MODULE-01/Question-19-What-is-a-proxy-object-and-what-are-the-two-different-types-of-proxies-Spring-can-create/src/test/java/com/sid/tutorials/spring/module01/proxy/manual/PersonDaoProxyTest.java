package com.sid.tutorials.spring.module01.proxy.manual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.spring.module01.Runner;
import com.sid.tutorials.spring.module01.ds.Person;

@SpringBootTest(classes = Runner.class)
class PersonDaoProxyTest {

	@Autowired
	PersonDaoProxy personDaoProxy;

	@Test
	void test() {
		Person person = personDaoProxy.findById(5);
		personDaoProxy.save(person);
	}

}
