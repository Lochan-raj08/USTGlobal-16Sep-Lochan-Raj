package com.ustglobal.curdoperations.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read {
public static void main(String[] args) {
	EntityManager entityManager=null;
	Cartoon cartoon=new Cartoon();
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		Cartoon cartoonDetails=entityManager.find(Cartoon.class,1 );
		System.out.println("Id--->"+cartoonDetails.getId());
		System.out.println("Name--->"+cartoonDetails.getName());
		System.out.println("Channel--->"+cartoonDetails.getChannel());
	} catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();

}
}
