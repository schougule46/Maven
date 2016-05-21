package com.HiberOper.HiberMaven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory f=HibernateUtil.getSessionFactory();
		User u=new User(1, "amol", "amolChougule", new Date());
		Session s=f.openSession();
		org.hibernate.Transaction t=s.beginTransaction();
		s.save(u);
		t.commit();
		s.close();	
		
	}

}
