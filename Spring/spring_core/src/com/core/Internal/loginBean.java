package com.core.Internal;

public class loginBean {
	private String username;
	private String userpwd;
	public loginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loginBean(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	@Override
	public String toString() {
		return "loginBean [username=" + username + ", userpwd=" + userpwd + "]";
	}
	

}
