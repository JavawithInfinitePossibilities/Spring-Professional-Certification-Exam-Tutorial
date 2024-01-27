package com.sid.tutorials.spring.module02.repository;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module02.ds.Employee;

@Component
public class EmployeeRepository {
    public Employee findEmployeeById(long id) {
        if (id == -1)
            throw new IllegalArgumentException("id cannot be -1");

        return new Employee(id);
    }

    public void saveEmployee(Employee employee) {
    }

    public void deleteEmployee(Employee employee) {
    }
}
