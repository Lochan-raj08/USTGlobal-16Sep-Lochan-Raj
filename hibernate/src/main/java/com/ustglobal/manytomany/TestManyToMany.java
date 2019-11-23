package com.ustglobal.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		Course course =new Course();
		course.setCid(1);
		course.setCname("R");
		
		Course course1 =new Course();
		course1.setCid(2);
		course1.setCname("Go");
		
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("Raj");
		List<Course> courses = new ArrayList<Course>();
		courses.add(course);
		courses.add(course1);
//		courses.add(course2);
		student.setCourses(courses);
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
