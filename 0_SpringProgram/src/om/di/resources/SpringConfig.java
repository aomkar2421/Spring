package om.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import om.di.beans.Address;
import om.di.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address addressObject() {
		Address add = new Address();
		
		add.setCity("Mumbai");
		add.setHouseno(01);
		add.setPincode(000000);
		
		return add;
	}
	
	@Bean
	public Student studentObject() {
		Student std = new Student();
		
		std.setName("AVI");
		std.setRollno(001);
		std.setAddress(addressObject());
		
		return std;
	}
	
}
