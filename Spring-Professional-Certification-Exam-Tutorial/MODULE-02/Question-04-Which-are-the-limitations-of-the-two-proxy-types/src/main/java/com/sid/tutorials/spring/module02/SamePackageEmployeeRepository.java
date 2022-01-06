package com.sid.tutorials.spring.module02;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module02.ds.Employee;

@Component
public class SamePackageEmployeeRepository {
    public void saveEmployee(Employee employee) {
    }

    protected void deleteEmployee(long id) {
    }

    void deleteEmployeeByEmail(String email) {
    }

    private void deleteEmployeeByPhone(String phone) {
        System.out.println("deleteEmployeeByPhone method called");
    }
}
