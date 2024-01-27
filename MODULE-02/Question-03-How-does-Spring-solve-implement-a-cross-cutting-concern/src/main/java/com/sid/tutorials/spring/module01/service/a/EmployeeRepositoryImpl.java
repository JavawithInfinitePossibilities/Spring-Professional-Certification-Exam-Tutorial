package com.sid.tutorials.spring.module01.service.a;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Employee;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    @Override
    public void saveEmployee(Employee employee) {
    }

    @Override
    public void deleteEmployee(Employee employee) {
    }
}
