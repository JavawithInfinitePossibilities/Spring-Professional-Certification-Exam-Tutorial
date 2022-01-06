package com.sid.tutorials.spring.module02.ds;

public class Employee {
	private long id;

	public Employee(long id) {

		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + '}';
	}
}
