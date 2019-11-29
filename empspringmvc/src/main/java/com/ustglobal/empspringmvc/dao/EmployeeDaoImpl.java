package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ustglobal.empspringmvc.dto.EmployeeBean;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public EmployeeBean login(String email, String password) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
//		try {
//			EmployeeBean bean=entityManager.find(EmployeeBean.class, id);
//			if(bean!=null) {
//				if(bean.getPassword().equals(password)) {
//					return bean;
//				}
//			}else {
//				return null;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
		
		String sql="from EmployeeBean where email=:email and password=:password";
		TypedQuery<EmployeeBean> tquery=entityManager.createQuery(sql,EmployeeBean.class);
		
//		Query query=entityManager.createQuery(sql);
		tquery.setParameter("email", email);
		tquery.setParameter("password", password);
		try {
			EmployeeBean bean=tquery.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean register(EmployeeBean bean) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(bean);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		try {
			EmployeeBean bean=entityManager.find(EmployeeBean.class, id);
			entityManager.remove(bean);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			return false;
		}
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		try {
			EmployeeBean bean=entityManager.find(EmployeeBean.class, id);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		EmployeeBean bean2=entityManager.find(EmployeeBean.class, bean.getId());
		bean2.setDoj(bean.getDoj());
		bean2.setEmail(bean.getEmail());
		bean2.setGender(bean.getGender());
		bean2.setId(bean.getId());
		bean2.setName(bean.getName());
		bean2.setPassword(bean.getPassword());
		entityTransaction.commit();
		return true;
}
	@Override
	public boolean changePassword(int id, String password) {
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		EmployeeBean bean2=entityManager.find(EmployeeBean.class, id);
		bean2.setPassword(password);
		entityTransaction.commit();
		return true;
	}
}
