package com.ustglobal.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernate.dto.Product;

public class GetReference {


	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;


		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager =  entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Product product = entityManager.getReference(Product.class, 101);// it will  hit the db if data is not there it will give EntityManagerException
//		Product product = entityManager.find(Product.class, 101); //it 
		System.out.println(product.getClass());
		
//		System.out.println(product.getId());
//		System.out.println(product.getPname());
//		System.out.println(product.getQuantity());



		entityManager.close();

	}

}


