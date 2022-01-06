/**
 * 
 */
package com.sid.tutorials.spring.module02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

}
