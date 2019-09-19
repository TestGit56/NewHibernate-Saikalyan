package com.google.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDAO {
	SessionFactory sf = HBUtil.getSessionFactory();
	
	public void save(Employee emp)
	{
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();
		session.close();
	} 
	 public Employee getById(String empName)
	 {
		 return sf.openSession().get(Employee.class, empName);
	 }
}
