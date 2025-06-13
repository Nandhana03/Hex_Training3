package com.hexaware.myspring;

public class User {
     
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	private String name;
	private String password;
	Role role;
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {};
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
	
	
}
