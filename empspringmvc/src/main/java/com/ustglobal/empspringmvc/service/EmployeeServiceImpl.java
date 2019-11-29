package com.ustglobal.empspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ustglobal.empspringmvc.dao.EmployeeDAO;
import com.ustglobal.empspringmvc.dao.EmployeeDaoImpl;
import com.ustglobal.empspringmvc.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	@Override
	public EmployeeBean login(String email, String password) {
		
		return dao.login(email, password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		//logic to check email and password
		
		return dao.register(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		return dao.searchEmployee(id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		
		return dao.updateEmployee(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		
		return changePassword(id, password);
	}

}
