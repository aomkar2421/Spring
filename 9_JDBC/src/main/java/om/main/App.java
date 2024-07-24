package om.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import om.beans.Student;
import om.beans.StudentMapper;
import om.resources.SpringConfigFile;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		//		//Insert
		//		int roll = 005;
		//		String name = "XYZ";
		//		int marks = 91;
		//		
		//		String insert = "insert into student values(?,?,?)";
		//		int a = jdbcTemplate.update(insert, name, roll, marks);
		//		if (a>0) {
		//			System.out.println("Succesful");
		//		}else {
		//			System.out.println("error");
		//		}


		////		//Update
		//		int roll = 002;
		//		String name = "Omkar";
		//		
		//		String update = "update student set sname=? where sroll=?";
		//		int a = jdbcTemplate.update(update, name, roll);
		//		if (a>0) {
		//			System.out.println("Succesful");
		//		}else {
		//			System.out.println("error");
		//		}


		////		//Delete
		//		int roll = 103;
		//		
		//		String update = "delete from student where sname=?";
		//		int a = jdbcTemplate.update(update, roll);
		//		if (a>0) {
		//			System.out.println("Succesful");
		//		}else {
		//			System.out.println("error");
		//		}


//		//Select
//		String select = "select * from student";
//		List<Student> stdList = jdbcTemplate.query(select, new StudentMapper());
//
//		for (Student std : stdList) {
//			System.out.println("Name : "+std.getName());
//			System.out.println("Marks : "+std.getMarks());
//			System.out.println("Roll No : "+std.getRollno());
//			System.out.println("=======================================");
//		}

		//Select with where
		String select = "select * from student where sroll=?";
		int roll = 2;
		List<Student> stdList = jdbcTemplate.query(select, new StudentMapper(),roll);

		for (Student std : stdList) {
			System.out.println("Name : "+std.getName());
			System.out.println("Marks : "+std.getMarks());
			System.out.println("Roll No : "+std.getRollno());
			System.out.println("=======================================");
		}



	}
}
