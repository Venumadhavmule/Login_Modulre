
public class Member {
	private String fname,lname, phone,email, uname,password;

	public Member() {
		super();
	}

	public Member(String fname, String lname, String phone, String email, String uname, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
		this.uname = uname;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
