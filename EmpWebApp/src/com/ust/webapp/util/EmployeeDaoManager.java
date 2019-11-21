package com.ust.webapp.util;

import com.ust.webapp.dao.EmployeeDao;
import com.ust.webapp.dao.EmployeeDaoJDBCImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}
	
	public static EmployeeDao getEmployeeDao() {
		return new EmployeeDaoJDBCImpl();
	}
}
