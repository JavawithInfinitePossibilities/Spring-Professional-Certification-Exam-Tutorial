package com.sid.tutorials.spring.module03.unchecked.dao;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module03.unchecked.ds.Person;
import com.sid.tutorials.spring.module03.unchecked.exception.DaoFilesystemException;
import com.sid.tutorials.spring.module03.unchecked.exception.PersonInvalidException;
import com.sid.tutorials.spring.module03.unchecked.exception.PersonStoreException;

@Component
public class PersonDao {
	public void save(Person person) {
		if (!valid(person))
			throw new PersonInvalidException();

		if (!filesystemActive(person))
			throw new DaoFilesystemException();

		if (!store(person))
			throw new PersonStoreException();
	}

	private boolean valid(Person person) {
		return false;
	}

	private boolean store(Person person) {
		return false;
	}

	private boolean filesystemActive(Person person) {
		return false;
	}
}
