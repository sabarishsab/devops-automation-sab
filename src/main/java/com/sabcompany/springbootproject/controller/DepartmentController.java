package com.sabcompany.springbootproject.controller;

import com.sabcompany.springbootproject.entity.Department;
import com.sabcompany.springbootproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department) {

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchAllDepartments() {
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Optional<Department> fetchByIdDepartment(@PathVariable("id") Long departmentId) {
        return departmentService.fetchByIdDepartment(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteByDepartmentId(@PathVariable("id") Long departmentId) {
        departmentService.deleteByDepartmentId(departmentId);
        return "Department Id Deleted Successfully ::::::";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentId(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartmentId(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department updateDepartmentyName(@PathVariable("name") String departmentName){
        return departmentService.updateDepartmentName(departmentName);
    }
}
