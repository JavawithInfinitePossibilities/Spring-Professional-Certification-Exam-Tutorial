package com.sid.tutorials.spring.module01.dao;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Person;

@Component
public class PersonDaoImpl implements PersonDao {
	@Override
	public Person findById(int id) {
		System.out.println("Searching for person...");
		return new Person();
	}

	@Override
	public void save(Person person) {
		System.out.println("Saving person...");
	}
}
