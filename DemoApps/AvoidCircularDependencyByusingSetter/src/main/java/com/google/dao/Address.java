package com.google.dao;

public class Address {
	
	
 private String city = null;
 
  private Employee employee = null;
  
public void setCity(String city) {
	this.city = city;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public String getCity()
{
	return city;
}
  
}
