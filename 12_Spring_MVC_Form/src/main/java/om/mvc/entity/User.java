package om.mvc.entity;

public class User {
	
	private int id;
	
	private String fname;
	
	private String email;
	
	private String password;
	
	private String check;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", email=" + email + ", password=" + password + ", check="
				+ check + "]";
	}
	
}
