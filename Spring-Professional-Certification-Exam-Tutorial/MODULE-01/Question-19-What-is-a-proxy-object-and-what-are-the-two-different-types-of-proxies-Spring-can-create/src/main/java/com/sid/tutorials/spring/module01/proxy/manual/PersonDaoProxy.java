package com.sid.tutorials.spring.module01.proxy.manual;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.dao.PersonDao;
import com.sid.tutorials.spring.module01.ds.Person;

@Component
public class PersonDaoProxy implements PersonDao {

	private final PersonDao personDao;

	public PersonDaoProxy(@Qualifier("personDaoImpl") PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public Person findById(int id) {
		System.out.println("before findById");
		Person person = personDao.findById(id);
		System.out.println("after findById");
		return person;
	}

	@Override
	public void save(Person person) {
		System.out.println("before save");
		personDao.save(person);
		System.out.println("after save");
	}
}
