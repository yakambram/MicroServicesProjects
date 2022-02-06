package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentReposiroty departmentReposiroty;

    public Department saveDepartment(Department department) {
        return departmentReposiroty.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentReposiroty.findByDepartmentId(departmentId);
    }
}
