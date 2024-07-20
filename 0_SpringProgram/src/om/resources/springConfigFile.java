package om.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import om.beans.Students;

@Configuration
public class springConfigFile {
	
	@Bean("stdObj1")
	public Students stdId1() {
		Students std = new Students();
		
		std.setEmail("abcd@mail.com");
		std.setName("abcd");
		std.setRollno(00000);

		return std;
	}
	
	@Bean("stdObj2")
	public Students stdId2() {
		Students std = new Students();
		
		std.setEmail("abcd@mail.com");
		std.setName("abcd");
		std.setRollno(77);

		return std;
	}
	
}
