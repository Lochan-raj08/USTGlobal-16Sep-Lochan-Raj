package com.ustglobal.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernate.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Product productDetail = entityManager.find(Product.class, 101);
		System.out.println("ID---"+productDetail.getId());
		System.out.println("Name---"+productDetail.getPname());
		System.out.println("Quantity---"+productDetail.getQuantity());
		entityManager.close();
	}

}
