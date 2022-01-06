/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.sid.tutorials.spring.module01.bean.SpringBeanRename;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
@PropertySources({ @PropertySource("file:../${app-home}/app-db.properties") })
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		SpringBeanRename bean = context.getBean(SpringBeanRename.class);
		bean.printProperties();
	}

}
