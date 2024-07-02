package com.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
public class Client {
	public static void main(String []args) {
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		User user = new User();
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(new Phone(1001, 12345678, "Personal"));
		phones.add(new Phone(1002, 45678345, "Office"));
		phones.add(new Phone(1003, 23478945, "Emergency"));
		user.setName("Husen Shaikh");
		user.setPhones(phones);
		session.save(user);
		tr.commit();
		session.close();
		System.out.println("Success");
	}

}
