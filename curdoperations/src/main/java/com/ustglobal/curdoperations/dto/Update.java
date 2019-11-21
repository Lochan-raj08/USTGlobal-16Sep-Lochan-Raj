package com.ustglobal.curdoperations.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Cartoon cartoon = entityManager.find(Cartoon.class, 1);
		cartoon.setName("GaliGali-SimSim");
		entityTransaction.begin();
		entityManager.persist(cartoon);
		System.out.println("Record Updated!!");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();

}
}
