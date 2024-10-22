package om.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import om.mvc.entity.User;
import om.mvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
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
	public String registerUser( @ModelAttribute User user, @RequestParam("img") String img, Model m ) {
		System.out.println("create user called");

		user.setImage(img);
		userService.registerUser(user);
		m.addAttribute("user", user);
		
		System.out.println("Inserted succesfully : "+user);
//		return "redirect:/register/";
		return "success";
	}
	
	@RequestMapping(path = "/user/{id}")
	public String demo( @PathVariable ("id") int id) {
		System.out.println("Id : "+id);

		return "home";
	}
	
	@RequestMapping(path = "/user/{id}/{name}")
	public String demo1( @PathVariable ("id") int id, @PathVariable ("name") String name ) {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);

		return "home";
	}
	
	@RequestMapping(path = "/load_file_upload")
	public String loadFileUpload() {
		return "file_upload";
	}
	
	
	@RequestMapping(path = "/fileUpload", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("img") MultipartFile file ) {
		
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		return "file_success";
	}
	
}
