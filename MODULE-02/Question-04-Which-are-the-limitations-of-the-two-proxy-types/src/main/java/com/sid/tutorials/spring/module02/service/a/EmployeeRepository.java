package com.sid.tutorials.spring.module02.service.a;

import com.sid.tutorials.spring.module02.ds.Employee;

public interface EmployeeRepository {
    Employee findEmployeeById(long id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void findAndUpdateEmployeeById(long id, Employee employeeToMerge);
}
