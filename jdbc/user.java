package jdbc;

public class user {
	
	private int user_id;
	private String name;
	private String username;
	private String password;
	private String email;
	private role role_id;
	private String mobileNumber;
	public user(int user_id, String name, String username, String password, String email, role role_id,
			String mobileNumber) {
		this.user_id = user_id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role_id = role_id;
		this.mobileNumber = mobileNumber;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public role getRole_id() {
		return role_id;
	}
	public void setRole_id(role role_id) {
		this.role_id = role_id;
	}
	
	@Override
	public String toString() {
		String pass = "";
		for(int i=0;i<password.length();i++) {
			pass+="*";
		}
		
		
		return "user [user_id=" + user_id + ", name=" + name + ", username=" + username + ", password=" + pass
				+ ", email=" + email + ", role_id=" + role_id.getName() + ", mobileNumber=" + mobileNumber + "]";
	}
	

}
