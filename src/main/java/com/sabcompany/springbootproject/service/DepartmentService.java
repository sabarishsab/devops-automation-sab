package com.sabcompany.springbootproject.service;

import com.sabcompany.springbootproject.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchAllDepartments();

    public Optional<Department> fetchByIdDepartment(Long departmentId);

    public void deleteByDepartmentId(Long departmentId);

   public Department updateDepartmentId(Long departmentId, Department department);

    public Department updateDepartmentName(String departmentName);
}
