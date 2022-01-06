package com.sid.tutorials.spring.module01.dao;

import com.sid.tutorials.spring.module01.ds.Department;

public class DepartmentDao {
    public Department findById(int id) {
        System.out.println("Searching for department...");
        return new Department();
    }

    public void save(Department department) {
        System.out.println("Saving department...");
    }
}
