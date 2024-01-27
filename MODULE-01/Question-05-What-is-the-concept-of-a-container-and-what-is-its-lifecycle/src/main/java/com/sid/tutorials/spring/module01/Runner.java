/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sid.tutorials.spring.module01.beans.SpringBean1;

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
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		SpringBean1 bean = context.getBean(SpringBean1.class);
	}

	@Bean
	public static CustomBeanFactoryPostProcessor getCustomBeanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}

	@Bean
	public static CustomBeanPostProcessor getCustomerBeanPostProcessor() {
		return new CustomBeanPostProcessor();
	}
}
