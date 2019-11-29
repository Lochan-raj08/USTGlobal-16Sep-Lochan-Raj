package com.ustglobal.empspringmvc.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;
import com.ustglobal.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class,editor);
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/login")
	public String login(String email,String password,HttpServletRequest request) {
		EmployeeBean bean=service.login(email, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credintial");
			return "login";
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}
	@GetMapping("/register")
	public String register() {

		return "register";
	}
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		boolean check=service.register(bean);
		if(check) {
			map.addAttribute("msg", "Your Registered");
		}else {
			map.addAttribute("msg", "Email is Repeated");
		}
		return "login";
	}

	@GetMapping("/home")
	public String home(@SessionAttribute(name= "bean", required = false) EmployeeBean bean,ModelMap map) {
		if(bean==null) {
			map.addAttribute("msg", "Login First!!!!");
			return "login";
		}else {

			return "home";
		}
	}
	@PostMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/search")
	public String search(@RequestParam("id")int id,
			ModelMap map) {
		EmployeeBean bean=service.searchEmployee(id);
		if(bean==null) {
			map.addAttribute("msg", "No Employee Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}

	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
		if(bean!=null) {
			try {
				service.deleteEmployee(bean.getId());
				session.invalidate();
				return "login";
			}catch (Exception e) {
				e.printStackTrace();
				return "login";
			}
		}else {
			return "login";
		}
	}
		@PostMapping("changepassword")
		public String change(@SessionAttribute(name= "bean", required = false) EmployeeBean bean,ModelMap map,String password) {
			if(bean!=null) {
				service.changePassword(bean.getId(), password);
				map.addAttribute("msg", "password changed");
				return "home";
			}else {
				map.addAttribute("msg", "Login First");
				return "login";
			}
		}
		@GetMapping("changepassword")
		public String change(HttpServletRequest request) {
			HttpSession session=request.getSession(false);
			if(session!=null) {
				return "changepassword";
			}else {
				return "login";
			}
		}
			
			@GetMapping("/update")
			public String update(HttpServletRequest request) {
				HttpSession session=request.getSession(false);
				if(session!=null) {
					return "updateprofile";
				}else {
					return "login";
				}
			}
			@PostMapping("/update")
			public String update(@SessionAttribute(name= "bean", required = false) EmployeeBean bean,ModelMap map,String name,String gender,Date doj) {
				if(bean!=null) {
					EmployeeBean bean2=bean;
					bean2.setDoj(doj);
					bean2.setGender(gender);
					bean2.setName(name);

					service.updateEmployee(bean2);
					map.addAttribute("msg", "Profile is Updated");
					return "home";
				}else {
					map.addAttribute("msg", "profile is not updated!!");
					return "home";
				}
			}
		}	

