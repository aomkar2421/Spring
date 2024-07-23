package om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		// XML Configuration
		String config_loc = "/om/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
	}
}
