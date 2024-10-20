package om.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/site")
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
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		System.out.println("Login method");
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("name", "OMKAR");
		model.addObject("email", "OMKAR@mail.com");
		model.addObject("phone", "1234567890");
		
		List<String> courses = new ArrayList<String>();
		courses.add("MERN");
		courses.add("spring");
		courses.add("springboot");
		
		model.addObject("courses", courses);
		
		model.setViewName("login");
		
		return model;
	}
}
