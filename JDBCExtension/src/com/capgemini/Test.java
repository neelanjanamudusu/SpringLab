package com.capgemini;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	First f1=new First();
	f1.setEid(1);
	f1.setEname("neelu");
	f1.setEsal(5000);
	session.save(f1);
	t.commit();
	System.out.println("success");
	session.close();
	factory.close();
}
}
