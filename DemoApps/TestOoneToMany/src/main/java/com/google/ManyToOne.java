package com.google;

import com.google.dao.Department;
import com.google.dao.DepartmentDAO;
import com.google.dao.Employee;
import com.google.dao.EmployeeDAO;

public class ManyToOne {
	public static void main(String[] args)
	{
		EmployeeDAO empdao = new EmployeeDAO();
		
		DepartmentDAO deptdao = new DepartmentDAO();
		

		
		
		Employee emp = new Employee(1251,"bruce","Byjus|sr");
		
		Department dept = deptdao.getById(2);
		emp.setDepartment(dept);
		empdao.saveOrupdate(emp);
		
		
	}

}
