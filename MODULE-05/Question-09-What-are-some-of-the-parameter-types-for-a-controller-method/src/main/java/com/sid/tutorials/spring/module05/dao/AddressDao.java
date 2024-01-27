package com.sid.tutorials.spring.module05.dao;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.spring.module05.ds.Address;

public interface AddressDao extends CrudRepository<Address, Integer> {
}
