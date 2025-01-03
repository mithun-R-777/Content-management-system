package com.edu.service;

import com.edu.dao.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	Department getDepartmentById(Integer departmentid);

	String deleteDepartmentById(Integer departmentid);

	Department updateDepartmentById(Integer departmentid, Department department);

}
