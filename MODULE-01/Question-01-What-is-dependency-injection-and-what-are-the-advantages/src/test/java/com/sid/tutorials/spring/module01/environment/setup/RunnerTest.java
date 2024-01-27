package com.sid.tutorials.spring.module01.environment.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import com.sid.tutorials.spring.module01.setup.Runner;
import com.sid.tutorials.spring.module01.setup.bean.HelloBean;

//@SpringBootTest(classes = Runner.class)
public class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		HelloBean helloBean = context.getBean(HelloBean.class);
		helloBean.sayHello();
	}

}
