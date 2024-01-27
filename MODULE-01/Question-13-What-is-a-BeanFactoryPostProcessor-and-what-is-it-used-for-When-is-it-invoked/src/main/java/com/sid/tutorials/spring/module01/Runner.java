/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sid.tutorials.spring.module01.beans.PropertyReadingBean;

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
		context.registerShutdownHook();

        PropertyReadingBean bean = context.getBean(PropertyReadingBean.class);
        bean.printProperties();
	}

	@Bean
	public static CustomBeanFactoryPostProcessor customerBeanFactoryPostProcessor() {
		return new CustomBeanFactoryPostProcessor();
	}
}
