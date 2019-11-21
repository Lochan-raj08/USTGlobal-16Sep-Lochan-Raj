package com.ustglobal.hibernate.jpql;


	
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

	public class DeleteJpql {
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "delete from Product where id=102";
			Query query = entityManager.createQuery(jpql);
			
			int i = query.executeUpdate();
			System.out.println(i+" row deleted");
			entityTransaction.commit();
			entityManager.close();
		}

	}



