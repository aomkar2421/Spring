package om.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component is used for annotation configuration for this we need to use     <context:component-scan base-package="om.beans"/> in xml file

@Component
public class Students {
	@Value("OMKARRRR")
	private String name;
	
	@Value("OOOOOOOOOOOOO@MAIL")
	private String email;
	
	@Value("6666")
	private int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRolllno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Roll No : "+rollno);
	}
}
