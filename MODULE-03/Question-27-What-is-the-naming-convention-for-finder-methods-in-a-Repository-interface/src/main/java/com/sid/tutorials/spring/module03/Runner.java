/**
 * 
 */
package com.sid.tutorials.spring.module03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
	}

}
