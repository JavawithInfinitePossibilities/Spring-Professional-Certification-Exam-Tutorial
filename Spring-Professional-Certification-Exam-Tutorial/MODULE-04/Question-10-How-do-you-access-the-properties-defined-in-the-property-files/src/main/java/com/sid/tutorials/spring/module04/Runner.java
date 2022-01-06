/**
 * 
 */
package com.sid.tutorials.spring.module04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableConfigurationProperties(ServerConfiguration.class)
public class Runner {

	@Autowired
	private ServerConfiguration serverConfiguration;

	/**
	 * @param args
	 */
	/*
	 * use --spring.profiles.active=dev or application.properties to set active
	 * spring profile
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
	}

}
