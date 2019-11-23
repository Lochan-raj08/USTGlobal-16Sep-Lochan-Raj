package com.ustglobal.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToMany {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		PencilBox pencilBox =  new PencilBox();
		pencilBox.setBid(1);
		pencilBox.setColor("red");
		Pencil pencil =  new Pencil();
		pencil.setPid(10);
		pencil.setName("Apsara");
		pencil.setPencilBox(pencilBox);
		Pencil pencil1 = new Pencil();
		pencil1.setPid(20);
		pencil1.setName("nataraja");
		pencil1.setPencilBox(pencilBox);
		
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
