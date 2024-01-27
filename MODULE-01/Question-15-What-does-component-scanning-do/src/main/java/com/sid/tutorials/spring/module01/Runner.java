/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.sid.tutorials.spring.module01.beans", includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean"), excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*(Controller|Service).*"))
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args)) {
		}
	}

}
