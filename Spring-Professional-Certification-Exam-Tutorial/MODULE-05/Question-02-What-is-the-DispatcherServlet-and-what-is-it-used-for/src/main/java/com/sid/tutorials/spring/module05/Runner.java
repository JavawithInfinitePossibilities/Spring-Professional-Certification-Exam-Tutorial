/**
 * 
 */
package com.sid.tutorials.spring.module05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * @author Lenovo
 *
 */
@SpringBootApplication
public class Runner {

	@Autowired
	private ApplicationContext applicationContext;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

	@Bean
	public SpringResourceTemplateResolver springTemplateResolver() {
		SpringResourceTemplateResolver springTemplateResolver = new SpringResourceTemplateResolver();
		springTemplateResolver.setApplicationContext(applicationContext);
		springTemplateResolver.setPrefix("/WEB-INF/views/");
		springTemplateResolver.setSuffix(".html");
		return springTemplateResolver;
	}

	@Bean
	public SpringTemplateEngine springTemplateEngine() {
		SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
		springTemplateEngine.setTemplateResolver(springTemplateResolver());
		return springTemplateEngine;
	}

	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(springTemplateEngine());
		return viewResolver;
	}
}
