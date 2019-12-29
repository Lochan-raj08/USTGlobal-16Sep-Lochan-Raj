package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer>{

	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name, doj=:doj, password=:password, gender=:gender where id=:id")
	public void update(String name,Date doj,String password,String gender,int id);
}