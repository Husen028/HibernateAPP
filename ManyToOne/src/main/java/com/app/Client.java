package com.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cust_shop");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Shop shop = new Shop("HShop");
		Customer c1 = new Customer("Raj", shop);
		Customer c2 = new Customer("Amit", shop);
		Customer c3 = new Customer("Ankit", shop);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Success");
	}

}
