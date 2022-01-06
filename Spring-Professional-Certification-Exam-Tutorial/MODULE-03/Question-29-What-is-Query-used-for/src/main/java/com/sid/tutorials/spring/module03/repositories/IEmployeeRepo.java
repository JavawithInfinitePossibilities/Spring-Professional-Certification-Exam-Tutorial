/**
 * 
 */
package com.sid.tutorials.spring.module03.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sid.tutorials.spring.module03.model.db.Employee;

/**
 * @author Lenovo
 *
 */
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

	public List<Employee> findByName(String name);

	List<Employee> findByLastName(String lastName);

	List<Employee> findBySalaryBetween(int min, int max);

	Employee findByEmail(String email);

	@Query("select e from employee e where e.name = :firstName and e.lastName = :lastName")
	List<Employee> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
