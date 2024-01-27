/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sid.tutorials.spring.module01.beans.SpringBean1;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
@ImportResource(locations = "classpath:/beans.xml")
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		SpringBean1 bean = context.getBean(SpringBean1.class);
		bean.printDependencies();
	}

}
