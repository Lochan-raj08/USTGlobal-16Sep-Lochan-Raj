package com.ustglobal.curdoperations.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");		
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();	
			entityTransaction.begin();
			Cartoon cartoonDelete = entityManager.find(Cartoon.class, 2);
			entityManager.remove(cartoonDelete);
			System.out.println("Removed!!!");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}

	}
}

