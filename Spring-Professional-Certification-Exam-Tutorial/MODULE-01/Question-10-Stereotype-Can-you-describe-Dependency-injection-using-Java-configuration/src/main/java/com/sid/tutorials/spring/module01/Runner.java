/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sid.tutorials.spring.module01.stereotypes.controller.TaxInformationController;
import com.sid.tutorials.spring.module01.stereotypes.ds.Article;

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
		TaxInformationController taxInformationController = context.getBean(TaxInformationController.class);
		taxInformationController.printTaxInformation(new Article(5));
	}

}
