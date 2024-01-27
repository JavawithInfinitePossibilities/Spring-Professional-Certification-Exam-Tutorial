package com.sid.tutorials.spring.module01;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		System.out.println("Printing Bean Names:");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println("Fetching Bean by Alias:");
        System.out.println(
                context.getBean("thirdSpringBean").getClass().getSimpleName()
        );
	}

}
