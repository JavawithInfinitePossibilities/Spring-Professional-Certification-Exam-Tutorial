/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
		try (ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args)) {
			context.registerShutdownHook();
			SpringBean1 springBean1 = context.getBean(SpringBean1.class);
			springBean1.sayHello();
		} finally {
		}

	}

}
