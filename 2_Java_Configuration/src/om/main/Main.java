package om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import om.beans.Students;
import om.resources.springConfigFile;

public class Main {
	public static void main(String[] args) {
				
//		//JAVA Configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);
		
//		//Below method is applied only when only one bean is present
		Students std1 = context.getBean(Students.class);
		std1.display();
		
		//When bean name is given or more beans are present then we can use below procedure
//		Students std = (Students) context.getBean("stdObj1");
//		std.display();
//		
//		Students std1 = (Students) context.getBean("stdObj2");
//		std1.display();
		
		
	}
}
