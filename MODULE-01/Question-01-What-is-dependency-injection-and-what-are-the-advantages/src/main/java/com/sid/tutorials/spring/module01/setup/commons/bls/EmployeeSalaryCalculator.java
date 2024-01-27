package com.sid.tutorials.spring.module01.setup.commons.bls;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module01.setup.commons.ds.Employee;
import com.sid.tutorials.spring.module01.setup.commons.ds.EmployeeSalary;

@Component
public class EmployeeSalaryCalculator {
    public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
        System.out.println("Calculating salaries");
        return Collections.emptyList();
    }
}
