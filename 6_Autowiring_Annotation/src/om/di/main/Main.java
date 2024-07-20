package om.di.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.di.beans.Student;
import om.di.resources.SpringConfig;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student std = (Student) context.getBean(Student.class);
		std.display();		
		
	}
}
