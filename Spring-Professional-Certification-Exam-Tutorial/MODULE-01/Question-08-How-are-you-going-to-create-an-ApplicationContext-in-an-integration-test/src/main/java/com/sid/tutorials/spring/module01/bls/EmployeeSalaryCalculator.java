package com.sid.tutorials.spring.module01.bls;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.ds.Employee;
import com.sid.tutorials.spring.module01.ds.EmployeeSalary;

@Component
public class EmployeeSalaryCalculator {
    public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
        System.out.println("Calculating salaries");
        return Collections.emptyList();
    }
}
