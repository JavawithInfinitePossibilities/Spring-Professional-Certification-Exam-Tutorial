/**
 * 
 */
package com.sid.tutorials.spring.module03.model.db;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "employee")
@Table
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	@Column(name = "first_name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	private String phone_number;
	private LocalDate hire_date;
	private int salary;

	@Builder
	public Employee(int employee_id, String name, String lastName, String email, String phone_number,
			LocalDate hire_date, int salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.salary = salary;
	}

}
