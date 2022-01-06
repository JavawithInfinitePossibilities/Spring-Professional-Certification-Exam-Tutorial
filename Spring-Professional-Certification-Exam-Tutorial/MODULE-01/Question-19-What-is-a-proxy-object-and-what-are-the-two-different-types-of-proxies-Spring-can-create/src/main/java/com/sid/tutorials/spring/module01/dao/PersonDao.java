package com.sid.tutorials.spring.module01.dao;

import com.sid.tutorials.spring.module01.ds.Person;

public interface PersonDao {
    Person findById(int id);

    void save(Person person);
}
