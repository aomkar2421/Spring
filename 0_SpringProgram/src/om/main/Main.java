package om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.beans.Students;
import om.resources.springConfigFile;

public class Main {
	public static void main(String[] args) {
		
		// XML Configuration
//		String config_loc = "/om/resources/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//		
//		Students std = (Students) context.getBean("stdId");
//		std.display();
//		
//		Students std2 = (Students) context.getBean("stdId2");
//		std2.display();
		
		
		
//		//JAVA Configuration
//		ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);
//		
//		//Below two are applied only when bean name is not given i.e when only @bean is present
////		Students std = (Students) context.getBean("stdId1");
////		std.display();
////		
////		Students std1 = context.getBean(Students.class);
////		std1.display();
//		
//		//When bean name is given then we can use below procedure
//		Students std = (Students) context.getBean("stdObj1");
//		std.display();
//		
//		Students std1 = (Students) context.getBean("stdObj2");
//		std1.display();
		
		
		
		
		// Annotation Configuration
//		String file_path = "om/resources/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(file_path);
//		Students std = (Students) context.getBean("students"); 
//		std.display();
		
	}
}
