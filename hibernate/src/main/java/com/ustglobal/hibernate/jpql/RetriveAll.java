package com.ustglobal.hibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.hibernate.dto.Product;

public class RetriveAll {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		String jpql = "from Product";
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		List<String> list = query.getResultList();
		for (String product : list) {
//			System.out.println(product.getId());
			System.out.println(product);
//			System.out.println(product.getQuantity());
		}
		entityManager.close();
	}

}
