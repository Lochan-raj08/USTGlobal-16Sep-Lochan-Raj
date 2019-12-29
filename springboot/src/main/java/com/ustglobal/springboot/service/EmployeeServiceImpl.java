package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dao.EmployeeDAO;
import com.ustglobal.springboot.dto.EmployeeBean;

//@Service
public class EmployeeServiceImpl implements EmployeeService{
//	@Autowired
	private EmployeeDAO dao;
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		if(bean.getName()!=null) {
			System.out.println("value");
			return dao.addEmployee(bean);	
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		return dao.getEmployee(id);
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		if(bean.getName()!=null||bean.getPassword()!=null) {
			if(bean.getPassword().length()>7) {
				if(bean.getPassword().contains("$")) {
					return dao.modifyEmployee(bean);
				}else {
					return false;
				}
				
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		return dao.getAllEmployee();
	}
}
