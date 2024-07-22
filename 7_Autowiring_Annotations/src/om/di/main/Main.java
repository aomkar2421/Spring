package om.di.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.di.beans.Student;
import om.di.resources.SpringConfig;

public class Main {
	public static void main(String[] args) {
		
//		//Setter Injection
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student std = (Student) context.getBean(Student.class);
		std.display();
		
//		//Constructor Injection
//		String config_loc = "/om/di/resources/constructorInjection.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
//		
//		Student std = (Student) context.getBean("stdId");
//		std.display();			
		
	}
}
