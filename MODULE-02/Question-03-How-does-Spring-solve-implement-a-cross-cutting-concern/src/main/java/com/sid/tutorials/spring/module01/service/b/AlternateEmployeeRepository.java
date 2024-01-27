package com.sid.tutorials.spring.module01.service.b;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Employee;

@Component
public class AlternateEmployeeRepository {
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    public void saveEmployee(Employee employee) {
    }

    public void deleteEmployee(Employee employee) {
    }
}
