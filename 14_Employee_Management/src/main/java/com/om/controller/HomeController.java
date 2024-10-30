package com.om.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.om.dao.EmpDaoImpl;
import com.om.entity.Emp;

@Controller
public class HomeController {
	
	@Autowired
	private EmpDaoImpl empDao;

	@RequestMapping(path = "/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(path = "/addEmp")
	public String addEmp() {
		return "add_emp";
	}
	
	@RequestMapping( path = "/createEmp", method = RequestMethod.POST )
	public String createEmp(@ModelAttribute Emp emp) {
		System.out.println(emp);
		
		int i = empDao.saveEmp(emp);
		
		System.out.println(" successfully inserted "+i);
		return "add_emp";
	}
	
}