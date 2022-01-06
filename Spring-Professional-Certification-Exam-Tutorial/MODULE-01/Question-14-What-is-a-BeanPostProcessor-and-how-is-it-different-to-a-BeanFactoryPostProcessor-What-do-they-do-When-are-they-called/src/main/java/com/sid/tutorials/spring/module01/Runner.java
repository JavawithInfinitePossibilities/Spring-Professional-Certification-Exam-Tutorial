/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sid.tutorials.spring.module01.beans.SpringBean1;
import com.sid.tutorials.spring.module01.beans.SpringBean2;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args)) {
		}
	}

	@Bean
	public static CustomBeanPostProcessor customBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}

	@Bean(initMethod = "initMethod")
	public SpringBean1 springBean1() {
		return new SpringBean1();
	}

	@Bean(destroyMethod = "destroyMethod")
	public SpringBean2 springBean2() {
		return new SpringBean2();
	}
}
