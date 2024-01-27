/**
 * 
 */
package com.sid.tutorials.spring.module01.setup.bean;

import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 *
 */
@Component
public class HelloBean {

	public void sayHello() {
		System.out.println("Hello From Spring Framework");
	}

}
