package com.google.dao;

import java.io.Serializable;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {
	@Id
	@Column(name="DEPT_ID")
	private Integer departmentId = null;
	@Column(name="DEPT_NAME")
	private String departmentName = null;
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval = true)
	@Fetch(FetchMode.SUBSELECT)
	@JoinColumn(name="DEPT_FK_ID")
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
