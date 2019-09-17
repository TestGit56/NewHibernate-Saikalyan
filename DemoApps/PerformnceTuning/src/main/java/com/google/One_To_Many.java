package com.google;

import java.util.LinkedHashSet;
import java.util.Set;

import com.google.dao.Department;
import com.google.dao.DepartmentDAO;
import com.google.dao.Employee;
import com.google.dao.EmployeeDAO;

public class One_To_Many {
	public static void main(String[] args)
	{
	
	DepartmentDAO deptdao = new DepartmentDAO();
	EmployeeDAO empdao = new EmployeeDAO();
	
/* Department javadept = new Department();
  javadept.setDepartmentId(1);
  javadept.setDepartmentName("java");
  
  Employee emp1 = new Employee(1230 ,"sai" ,"sr.s/w");
  Employee emp2 = new Employee(1231 ,"saikalyan" ,"jr.s/w");
  Employee emp3 = new Employee(1232 ,"saisiri" ,"ssr.s/w");
  
  
  Set<Employee> empSet = new LinkedHashSet<Employee>();
  empSet.add(emp1);
  empSet.add(emp2);
  empSet.add(emp3);
  
  javadept.setEmployeeset(empSet);
  
  deptdao.saveOrUpdate(javadept);
    
	
  Department eledept = new Department();
  eledept.setDepartmentId(2);
  eledept.setDepartmentName("Ele");
  deptdao.saveOrUpdate(eledept);*/
	
deptdao.delete(4);
  
/*Department dept = deptdao.getById(1);
	
	System.out.println(dept.getDepartmentId() + "  :: "+dept.getDepartmentName());
	
	Set<Employee> employeeSet = dept.getEmployeeset();
	for(Employee emp : employeeSet)
	{
		System.out.println(emp);
	}
	*/

	
	}
	

}
