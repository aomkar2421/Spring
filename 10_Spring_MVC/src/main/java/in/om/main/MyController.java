package in.om.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {
		System.out.println("OpenHeloPage() executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
	}
	
	@GetMapping("/aboutPage")
	public String openAboutPage() {
		System.out.println("OpenAboutPage() executed");
		return "about";
	}
	
	@GetMapping("/myForm")
	public String formPage() {
		System.out.println("FormPage() executed");
		return "my-form";
	}
	
//	@PostMapping("/submitForm")
//	public String handleSubmit( HttpServletRequest req) {
//		System.out.println("SUBMIT FORM EXECUTED");
//		
//		String name2 = req.getParameter("name1");
//		String email2 = req.getParameter("email1");
//		String phone2 = req.getParameter("phone1");
//		
//		System.out.println(name2+" "+email2+" "+phone2);
//		
//		return "profile";
//	}
	
	@PostMapping("/submitForm")
	public String handleSubmit( @ModelAttribute User user ) {
		System.out.println("SUBMIT FORM EXECUTED");
		
		System.out.println(user.getName1()+" "+user.getEmail1()+" "+user.getPhone1());
		
		return "profile";
	}
	
}
