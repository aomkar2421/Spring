package spring.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.enteties.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public int insert(Student student) {
		Integer i = (Integer) hibernateTemplate.save(student);
		return i;
	}
	
}
