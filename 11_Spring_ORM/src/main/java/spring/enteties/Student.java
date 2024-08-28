package spring.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int stdId;
	private String stdName;
	private String stdCity;
	
	public Student(int stdId, String stdName, String stdCity) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCity = stdCity;
	}
	
	public Student() {
		
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}
	
}
