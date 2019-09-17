package com.google.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;
@Entity
@Table(name="Employee")
public class Employee implements Serializable{
	@Id
	@Column(name="EMP_ID")
	private Integer empId = null;
	@Column(name="EMP_NAME")
	private String empName = null;
	@Column(name="EMP_DESG")
	private String empDesg = null;
	@ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="DEPT_FK_ID")
	private Department department = null;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, String empDesg) {
		

		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		

	}
	public Integer getEmpId() {
		return empId;
	}
	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
