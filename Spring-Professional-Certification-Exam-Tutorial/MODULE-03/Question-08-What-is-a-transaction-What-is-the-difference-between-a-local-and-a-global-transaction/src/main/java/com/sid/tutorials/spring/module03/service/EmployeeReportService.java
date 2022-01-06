package com.sid.tutorials.spring.module03.service;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.spring.module03.dao.EmployeeDao;
import com.sid.tutorials.spring.module03.ds.Employee;

@Service
public class EmployeeReportService {

	@Autowired
	private EmployeeDao employeeDao;

	public void printReport() {
		System.out.println("Employee Report Start");

		System.out.println("findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("findEmployeesEmails(): " + employeeDao.findEmployeesCount());

		System.out.println("Employee Report Stop");
	}

	@Transactional
	public void printReportInTransaction() {
		System.out.println("Employee Report Start - Transactional");

		System.out.println("Transactional findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("Transactional findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("Transactional findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("Transactional findEmployeesEmails(): " + employeeDao.findEmployeesCount());
		System.out.println("Transactional findEmployeesEmails(): " + employeeDao.findEmployeesCount());

		System.out.println("Employee Report Stop - Transactional");
	}

	public void printEmployees() {
		System.out.println("Printing list of employees");
		employeeDao.findAllEmployees().forEach(System.out::println);
	}

	public void deleteAllEmployees() {
		System.out.println("Deleting all employees...");
		employeeDao.deleteAllEmployees();
	}

	public void saveEmployeesWithoutTransaction() {
		System.out.println("Saving employees without transaction...");
		saveEmployees();
	}

	@Transactional
	public void saveEmployeesInTransaction() {
		System.out.println("Saving employees with transaction...");
		saveEmployees();
	}

	private void saveEmployees() {
		employeeDao.saveEmployee(
				new Employee(1, "John", "Doe", "John.Doe@corp.com", "555-55-55", LocalDate.of(2019, 06, 05), 70000));
		employeeDao.saveEmployee(new Employee(2, "Willow", "Zhang", "Willow.Zhang@corp.com", "555-55-56",
				LocalDate.of(2019, 06, 05), 80000));
		employeeDao.saveEmployee(new Employee(3, "Jayvon", "Grant", "Jayvon.Grant@corp.com", "555-55-57",
				LocalDate.of(2019, 06, 05), 90000));
		employeeDao.saveEmployee(new Employee(-1, "Shaylee", "Mcclure", "Shaylee.Mcclure@corp.com", "555-55-58",
				LocalDate.of(2019, 06, 05), 120000));
		employeeDao.saveEmployee(new Employee(5, "Miley", "Krueger", "Miley.Krueger@corp.com", "555-55-59",
				LocalDate.of(2019, 06, 05), 110000));
	}
}
