package spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.dao.StudentDao;
import spring.enteties.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);
        Student student = new Student(0011, "Omkar", "pune");
        int i = studentDao.insert(student);
        System.out.println("Done "+i);
    }
}
