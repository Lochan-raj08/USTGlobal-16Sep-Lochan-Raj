package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.dto.EmployeeResponse;
import com.ustglobal.springboot.service.EmployeeService;


@RestController
public class EmployeeController {
	private final int successCode=201;
	
	private final int failCode=401;
	
	private final String success="Success";
	
	private final String failed="Failure";
	
	
	
	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/addemp",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("data added to DB");
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Data not added to DB");
		}
		return response;

	}

	@PutMapping(path = "/modify", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("data Modified");
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Data not Modified");
		}
		return response;
	}

	@GetMapping(path = "/get", 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		EmployeeResponse response=new EmployeeResponse();
		EmployeeBean bean=service.getEmployee(id);
		if(bean!=null) {
			response.setEmployeeBeans(Arrays.asList(bean));
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("data Found");
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("No data Found");
		}
		
		return response;
	}

	@DeleteMapping(path = "/delete/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) {
		EmployeeResponse response=new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setDescription("data added to DB");
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Data not added to DB");
		}
		return response;

	}

	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		EmployeeResponse response=new EmployeeResponse();
		List<EmployeeBean> beans=service.getAllEmployee();
		if(beans!=null) {
			response.setStatusCode(successCode);
			response.setMessage(success);
			response.setEmployeeBeans(beans);
		}else {
			response.setStatusCode(failCode);
			response.setMessage(failed);
			response.setDescription("Data not found");
		}
		
		return response;
	}
	
	@GetMapping(path = "/exec",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int exc=1/0;
	}
}
