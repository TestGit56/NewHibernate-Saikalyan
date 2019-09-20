package com.google.dao;

public class Employee {
	private String empName = null;
	
	private Address address = null;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getINfo()
	{
		System.out.println("EmpName "+empName);
		System.out.println("Address "+address.getCity());
	}
	

}
