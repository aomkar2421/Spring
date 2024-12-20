package om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.beans.Students;

public class Main {
	public static void main(String[] args) {
		
		// XML Configuration
		String config_loc = "/om/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Students std = (Students) context.getBean("stdId");
		std.display();
		
		Students std2 = (Students) context.getBean("stdId2");
		std2.display();
		
	}
}
