package com.edu.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private Integer departmentid;
	private String departmentname;
	private String departmentlocation;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer departmentid, String departmentname, String departmentlocation) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.departmentlocation = departmentlocation;
	}
	public Integer getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentlocation() {
		return departmentlocation;
	}
	public void setDepartmentlocation(String departmentlocation) {
		this.departmentlocation = departmentlocation;
	}
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", departmentlocation=" + departmentlocation + "]";
	}
	
	
	
	
	

}
