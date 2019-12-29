package com.ustglobal.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springboot.dto.EmployeeBean;
//@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
//	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			System.out.println("added");
			transaction.commit();
			return true;
		} catch (Exception e) {
			System.out.println("not added");
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean bean=manager.find(EmployeeBean.class, id);
			if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean bean=manager.find(EmployeeBean.class, id);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeBean bean1=manager.find(EmployeeBean.class, bean.getId());
		bean1.setName(bean.getName());
		bean1.setDoj(bean.getDoj());
		bean1.setGender(bean.getGender());
		bean1.setPassword(bean.getPassword());
		transaction.commit();
		return true;
		}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from EmployeeBean";
		TypedQuery<EmployeeBean> tquery=manager.createQuery(jpql,EmployeeBean.class);
		List<EmployeeBean> list=tquery.getResultList();
		return list;
	}

}
