package com.google.dao;

import java.io.Serializable;
import java.util.Set;

public class Department implements Serializable {
	private Integer departmentId = null;
	private String departmentName = null;
	private Set<Employee> employeeset = null;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer departmentId, String departmentName, Set<Employee> employeeset) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeset = employeeset;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employeeset="
				+ employeeset + "]";
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Set<Employee> getEmployeeset() {
		return employeeset;
	}
	public void setEmployeeset(Set<Employee> employeeset) {
		this.employeeset = employeeset;
	}
	

}
