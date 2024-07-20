package om.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	private int rollno;
	
	@Autowired
	@Qualifier("addressObject2")
	private Address address;
	
	//Setter Injection
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollno);
		System.out.println("Address : "+address);
	}
	
}
