package com.sid.tutorials.spring.module03.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ToString
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private float salary;
}
