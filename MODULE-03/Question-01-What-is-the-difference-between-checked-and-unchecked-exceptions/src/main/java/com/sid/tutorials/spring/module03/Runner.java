/**
 * 
 */
package com.sid.tutorials.spring.module03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sid.tutorials.spring.module03.unchecked.dao.PersonDao;
import com.sid.tutorials.spring.module03.unchecked.ds.Person;

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
		PersonDao personDao = context.getBean(PersonDao.class);
        Person person = context.getBean(Person.class);

        personDao.save(person);
	}

}
