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
		
   Employee emp = new Employee(1200,"saikalyan","Ele||Ac");
    
     Department department = deptdao.getById(4);
   emp.setDepartment(department);
		
		empdao.saveOrupdate(emp);
		empdao.Delete(1200);
		
		


		

		
		
	}

}
