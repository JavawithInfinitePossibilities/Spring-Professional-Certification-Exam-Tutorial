package com.sid.tutorials.spring.module02.beans;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module02.annotation.MonitoredRepository;
import com.sid.tutorials.spring.module02.ds.Department;

@Component
@MonitoredRepository
public class DepartmentRepository {

    public Department findDepartment(String pattern) {
        return new Department();
    }

    public void updateDepartment(int id, Department department) {
    }
}
