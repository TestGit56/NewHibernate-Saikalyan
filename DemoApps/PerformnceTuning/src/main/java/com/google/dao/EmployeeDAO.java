package com.google.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeDAO {
	SessionFactory sf = HBUtil.getSessionFactory();
	public void saveOrupdate(Employee emp)
	{
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();	
	}
		public Employee getById(Integer empId)
	{
		return sf.openSession().get(Employee.class, empId);
		
	}
		public void Delete(Integer empId)
		{
			Session  session = sf.openSession();
			Employee emp = session.get(Employee.class, empId);
			if(emp != null)
			{
				session.beginTransaction();
				session.delete(emp);
				session.getTransaction().commit();
			}
			session.close();
		}

}
