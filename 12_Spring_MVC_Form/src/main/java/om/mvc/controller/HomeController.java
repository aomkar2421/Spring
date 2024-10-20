package om.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import om.mvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homePage( Model model) {
		System.out.println("Home method");
		return "home";
	}
	
	@RequestMapping("/register")
	public String registerPage() {
		System.out.println("Register method");
		
		return "register";
	}
	
	@RequestMapping(path = "/createUser", method = RequestMethod.POST )
	public String registerUser( @ModelAttribute User user ) {
		System.out.println("create user called");
		System.out.println(user);
		return "register";
	}
	
}
