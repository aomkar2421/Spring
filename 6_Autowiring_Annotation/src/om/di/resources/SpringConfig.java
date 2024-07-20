package om.di.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import om.di.beans.Address;
import om.di.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address addressObject1() {
		//setter injection
		Address add = new Address();
		
		add.setCity("Mumbai");
		add.setHouseno(01);
		add.setPincode(412104);
				
		return add;
	}
	
	@Bean
	public Address addressObject2() {
		//setter injection
		Address add = new Address();
		
		add.setCity("Pune");
		add.setHouseno(91);
		add.setPincode(411041);
				
		return add;
	}
		
	@Bean
	public Student studentObject() {
		
		//setter injection
		Student std = new Student();
		
		std.setName("AVI");
		std.setRollno(001);
//		std.setAddress(addressObject());
		
		return std;
	}
	
}
