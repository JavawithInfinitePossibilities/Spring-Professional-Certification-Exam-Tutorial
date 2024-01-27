/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sid.tutorials.spring.module01.beans.SpringBean3;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
@ComponentScan(lazyInit = true)
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		context.registerShutdownHook();
		context.getBean(SpringBean3.class);
	}

}
