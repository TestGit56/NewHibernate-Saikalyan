package com.google.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable{
	@Id
	@Column(name="EMP_ID")
	private Integer empId = null;
	@Column(name="EMP_NAME")
	private String empName =  null;
	
    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ADDR_FK_ID")
	private Address address = null;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		

	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	public Integer getEmpId() {
		return empId;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
