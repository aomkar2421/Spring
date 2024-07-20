package om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.beans.Students;

public class Main {
	public static void main(String[] args) {
				
		// Annotation Configuration
		String file_path = "om/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file_path);
		Students std = (Students) context.getBean("students"); 
		std.display();
		
	}
}
