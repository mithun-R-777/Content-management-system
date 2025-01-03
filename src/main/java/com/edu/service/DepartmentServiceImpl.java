package com.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edu.dao.Department;
import com.edu.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}

	@Override
	public Department getDepartmentById(Integer departmentid) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentid).get();
	}
	
	@Override
	public String deleteDepartmentById(@PathVariable("deptid") Integer departmentid) {
		
		departmentRepository.deleteById(departmentid);
		return "Department with id="+departmentid+"is deleted";
	}

	@Override
	public Department updateDepartmentById(Integer departmentid, Department department) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
