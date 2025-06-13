package task1.task2;

import java.util.Scanner;
import dao.UserDaoI;
import model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        UserDaoI dao= new UserDaoI();
        
        Scanner in=new Scanner(System.in);
    	
    	System.out.println("Welcome to the portal");
    	int choice=0;
    	System.out.println("1.Sign up");
    	System.out.println("2.Sign in");
    	System.out.println("3.Forgot password");
    	System.out.println("4.show all the users");
    	System.out.println("5.Exit");
    	int flag=1;
    	do {
    	System.out.println("Enter ur choice:");
    	choice=in.nextInt();
     
    	switch(choice)
    	{
    	case 1:
    		System.out.println("Enter your userid:");
    		int uid=in.nextInt();
    		in.nextLine();
    		System.out.println("Enter your name:");
    		String name=in.nextLine();
    		System.out.println("Enter your email:");
    		String email=in.nextLine();
    		System.out.println("Enter your password:");
    		String pass=in.nextLine();
    		
    		User obj = new User(uid,name,email,pass);
            
    	  	dao.signup(obj); 
    	  	break;
    	  	
    	case 2:
    		System.out.println("Enter your userid:");
    		int uid1=in.nextInt();
    		in.nextLine();
    		System.out.println("Enter your password:");
    		String pass1=in.nextLine();
    		dao.signin(uid1,pass1);
    		break;
    		
    	case 3:
    		System.out.println("Enter your userid:");
    		int uid2=in.nextInt();
    		in.nextLine();
    		System.out.println("Enter your email:");
    		String email1=in.nextLine();
    		dao.forgotpass(uid2,email1);
    		break;
    		
    	case 4:
    	    dao.showAll();
    	    break;
    	case 5:
    		System.out.println("Thank you!!");
    		flag=0;
    		break;
    	default:
    		System.out.println("Invalid choice."); 		
    	}
    	
    	}while(flag==1);
    }
}



//JDBC Assignment – Login Management System


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
 