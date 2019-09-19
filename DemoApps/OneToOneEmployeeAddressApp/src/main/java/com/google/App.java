package com.google;

import com.google.dao.Address;
import com.google.dao.Employee;
import com.google.dao.EmployeeDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
   EmployeeDAO empdao = new EmployeeDAO();
   Address addr = new Address(1,33,"hyd","TG");
  Employee emp = new Employee(111,"saikalyan");
   emp.setAddress(addr);
   empdao.save(emp);
 
    }
}
