package com.ustglobal.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernate.dto.Product;

public class Reattaching {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTansaction = null;
		
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTansaction = entityManager.getTransaction();
			entityTansaction.begin();
			Product product = entityManager.find(Product.class, 101);
			System.out.println(entityManager.contains(product));
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			Product product2  = entityManager.merge(product);
			
			
			
			product2.setPname("laptop");
			System.out.println("Update Record");
			entityTansaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTansaction.rollback();
		}
		
		entityManager.close();
		
	}

}
