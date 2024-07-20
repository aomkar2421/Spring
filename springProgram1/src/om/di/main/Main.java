package om.di.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.di.beans.Student;

public class Main {
	public static void main(String[] args) {
		
//		//Setter Injection
//		String config_loc = "/om/di/resources/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//		
//		Student std = (Student) context.getBean("stdId");
//		std.display();
		
		//Constructor Injection
		String config_loc = "/om/di/resources/constructorInjection.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
		
		
	}
}
