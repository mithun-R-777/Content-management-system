package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Department;
import com.edu.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
		
	}
	@GetMapping("/getDepartmentById/{deptid}")
	public Department getDepartmentById(@PathVariable("deptid") Integer departmentid) {
		return departmentService.getDepartmentById(departmentid);
	}
	
	@DeleteMapping("/deleteDepartmentById/{deptid}")
	public String deleteDepartmentById(@PathVariable("deptid") Integer departmentid) {
		departmentService.deleteDepartmentById(departmentid);
		return "Department with id="+departmentid+"is deleted";
	}
	@PutMapping("/updateDepartmentById/{deptid}")
	public Department updateDepartmentById(@PathVariable("deptid") Integer departmentid, @RequestBody Department department) {
		return departmentService.updateDepartmentById(departmentid,department);
	}
	
}
