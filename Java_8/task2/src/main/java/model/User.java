package model;

public class User {
	
	public User()
	{
		
	}
      
	public User(int userId, String name, String emailid, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
	}
	
	private int userId;
	private String name;
	private String emailid;
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailid=" + emailid + ", password=" + password + "]";
	}	
	
}


//
//JDBC Assignment – Login Management System
//Q1. Sign Up
//Write a JDBC program that allows a user to sign up by providing:
//userId (Integer)
//name (String)
//email (String)
//password (String)
//Store this information in a Login table.
//Q2. Forgot Password
//Write a program where the user can retrieve their password by entering:
//userId
//email
//If the record exists, display the password. Otherwise, show an appropriate message.
//Q3. Sign In
//Implement a login feature where a user can enter:
//userId
//password
//Check if these credentials match a record in the Login table. If matched, display a welcome message with their name.
//Q4. List All Users
//Write a program to display a list of all registered users with only:
//userId
//name
//(Do not show passwords or email IDs.)
 