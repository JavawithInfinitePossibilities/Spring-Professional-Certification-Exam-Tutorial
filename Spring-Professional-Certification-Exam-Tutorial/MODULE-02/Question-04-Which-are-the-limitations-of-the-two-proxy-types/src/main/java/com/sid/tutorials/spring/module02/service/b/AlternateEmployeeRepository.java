package com.sid.tutorials.spring.module02.service.b;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module02.ds.Employee;

@Component
public /*final*/ class AlternateEmployeeRepository {
    public Employee findEmployeeById(long id) {
        return new Employee();
    }

    public void saveEmployee(Employee employee) {
    }

    public /*final*/ void deleteEmployee(Employee employee) {
    }

    public void findAndUpdateEmployeeById(long id, Employee employeeToMerge) {
        Employee employeeById = findEmployeeById(id);
        saveEmployee(employeeById);
    }
}
