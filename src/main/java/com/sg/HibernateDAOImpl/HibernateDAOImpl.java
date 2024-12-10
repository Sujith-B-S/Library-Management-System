package com.sg.HibernateDAOImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sg.entityclass.Admins;

public class HibernateDAOImpl {
	
	private Session session;

	public HibernateDAOImpl() {
		
		 session = new Configuration()
				.configure()
				.addAnnotatedClass(Admins.class)
				.buildSessionFactory()
				.openSession();
	}
	
	public void inserAdminData(Admins a)
	{
		Transaction t = session.beginTransaction();
		session.persist(a);
		t.commit();
	}
	
	public Admins fetchSpecificAdmin(String email) {
	    String hql = "FROM Admins WHERE email = :email";
	    return session.createQuery(hql, Admins.class)
	                  .setParameter("email", email)
	                  .uniqueResult();
	}


}
