package dao;

import model.User;

public interface UserDao {
	
	void signup(User u);
	
	void forgotpass(int uid, String email);
	
	void signin(int uid, String pass);
	
	void showAll();
}


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
