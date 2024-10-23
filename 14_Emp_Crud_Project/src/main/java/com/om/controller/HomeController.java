package com.om.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(path = "/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(path = "/addEmp")
	public String addEmp() {
		return "add_emp";
	}
	
}
