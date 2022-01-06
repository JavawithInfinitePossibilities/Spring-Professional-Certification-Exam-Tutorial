/**
 * 
 */
package com.sid.tutorials.spring.module03.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.spring.module03.model.db.Employee;

/**
 * @author Lenovo
 *
 */
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

	public List<Employee> findByName(String name);
}
