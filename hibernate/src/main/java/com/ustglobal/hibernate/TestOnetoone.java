package com.ustglobal.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.onetoone.Person;
import com.ustglobal.onetoone.VoterCard;

public class TestOnetoone {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager =null;
		EntityTransaction entityTransaction = null;
		VoterCard voterCard = new VoterCard();
		voterCard.setVid(1);
		voterCard.setName("Raj");
		Person person = new Person();
		person.setName("Shareef");
		person.setVoterCard(voterCard);
		

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class, 1);
			System.out.println(vCard.getPerson().getName());
//			entityManager.persist(person);
//			person.setPid(1);
//			person.setName("Lochan");
//			entityManager.persist(person);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
