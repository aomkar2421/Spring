package om.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homePage( Model model) {
		System.out.println("Home method");
		
		model.addAttribute("name", "omkar");
		model.addAttribute("email", "omkar@mail.com");
		model.addAttribute("phone", "1234567890");
		
		List<String> courses = new ArrayList<String>();
		courses.add("JAVA");
		courses.add("spring");
		courses.add("springboot");
		
		model.addAttribute("courses", courses);
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		System.out.println("Login method");
		return "login";
	}
}
