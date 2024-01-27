/**
 * 
 */
package com.sid.tutorials.spring.module01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sid.tutorials.spring.module01.no.aop.actions.ComplexReportAction;

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
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		context.registerShutdownHook();
		ComplexReportAction complexReportAction = context.getBean("complexReportActionnoaop",
				ComplexReportAction.class);
		try {
			complexReportAction.perform();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
