package com.google.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DepartmentDAO {
	SessionFactory sf = HBUtil.getSessionFactory();
	
public void saveOrupdate(Department dept)
{
	Session session = sf.openSession();
	session.beginTransaction();
	session.saveOrUpdate(dept);
	session.getTransaction().commit();
	session.close();
      }
public Department getById(Integer  departmentId)
{
	return sf.openSession().get(Department.class, departmentId);
}
 public void delete(Integer departmentId)
 {
	 Session session = sf.openSession();
	 Department dept = session.get(Department.class, departmentId);
	  if(dept != null)
	  {
		  session.beginTransaction();
		  session.delete(dept);
		  session.getTransaction().commit();
	  }
	  session.close();
 }

}
