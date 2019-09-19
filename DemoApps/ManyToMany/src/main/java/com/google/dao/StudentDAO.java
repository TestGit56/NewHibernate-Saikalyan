package com.google.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentDAO {
	SessionFactory sf  = HBUtil.getSessionFactory();

	
	 public void saveOrupdate(Student student)
	 {
		 Session session = sf.openSession();
		 session.beginTransaction();
		 session.saveOrUpdate(student);
		 session.getTransaction().commit();
		 session.close();
	 }
	 public Student getById(Student studentId)
	 {
		 return sf.openSession().get(Student.class, studentId);
	 }
}
