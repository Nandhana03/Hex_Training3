import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;
 
public class Main {
 
	public static void main(String[] args) {
		
//		  List<User> Users= new ArrayList();
//	
//	        Scanner sc = new Scanner(System.in);
//	        int choice;
//                
//	        do {
//	            System.out.println("\n====== User Menu ======");
//	            System.out.println("1. Sign In");
//	            System.out.println("2. Sign Up");
//	            System.out.println("3. Update Password");
//	            System.out.println("4. Remove User");
//	            System.out.println("5. Show All Users");
//	            System.out.println("6. Exit");
//	            System.out.print("Enter your choice: ");
// 
//	            choice = sc.nextInt();
// 
//	            switch (choice) {
//	                case 1:
//	                    System.out.println("Sign In selected");
//	                    
//	                    User us= new User();
//	                    int flag=0;
//	                    sc.nextLine();
//	                    System.out.println("Enter usuer name");
//	                    us.setUname(sc.nextLine());
//	                    
//	                    System.out.println("Enter usuer Password");
//	                    us.setPassd(sc.nextLine());
//	                    
//	                    for(User obj : Users)
//	                    {
//	                    	if(obj.getUname().contains(us.getUname()) &&  obj.getPassd().contains(us.getPassd()))
//	                    	{
//	                    		flag=1;
//	                    	}
//	                    }
//	                    if(flag==1)
//	                    {
//	                    	System.out.println("Login successfull");
//	                    }
//	                    else
//	                    {
//	                    	System.out.println("Login failed");
//	                    }
//	                    break;
//	                case 2:
//	                	User u= new User();
//	                    sc.nextLine();
//	                    System.out.println("Enter usuer name");
//	                    u.setUname(sc.nextLine());
//	                    
//	                    System.out.println("Enter usuer Password");
//	                    u.setPassd(sc.nextLine());
//	                    
//	                    
//	                    System.out.println("Enter usuer Email");
//	                    u.setEmail(sc.nextLine());
//	                    
//	                    
//	                    System.out.println("Enter Age");
//	                    u.setAge(sc.nextInt());
//	                    
//	                    Users.add(u);
//	                    
// 
//	                    
//	                    
//	                    
//	              
//	                    break;
//	                case 3:
//	                	User user= new User();
//	                    int flag1=0;
//	                    sc.nextLine();
//	                    System.out.println("Enter usuer name");
//	                    user.setUname(sc.nextLine());
//	                    
//	                    System.out.println("Enter usuer Password");
//	                    user.setPassd(sc.nextLine());
//	                    
//	                    for(User obj : Users)
//	                    {
//	                    	if(obj.getUname().contains(user.getUname()) &&  obj.getPassd().contains(user.getPassd()))
//	                    	{
//	                    		flag1=1;
//	                    		System.out.println("Enter your new Password");
//			                    user.setPassd(sc.nextLine());
//			                    obj.setPassd(user.getPassd());
//			                    System.out.println("Pwd updated");
//	                    	}
//	                    	else
//		                    {
//		                    	System.out.println("Login credentials are not crt");
//		                    	break;
//		                    }
//	                    }
//	                    
//	                    break;
//	                case 4:
//	                	sc.nextLine();
//	                	System.out.println("Enter Username:");
//	                	String unm = sc.nextLine();
//	                	 
//	                	System.out.println("Enter Password:");
//	                	String upass = sc.nextLine();
//	                	 
//	                	boolean flag2 = false;
//	                	 
//	                	for (int i = 0; i < Users.size(); i++) {
//	                	    User use = Users.get(i);
//	                	    if (use.getUname().equals(unm) && use.getPassd().equals(upass)) {
//	                	        Users.remove(i);
//	                	        flag2 = true;
//	                	        break;
//	                	    }
//	                	}
//	                	 
//	                	if (flag2 == true) {
//	                	    System.out.println("User removed successfully");
//	                	} else {
//	                	    System.out.println("User not found or wrong credentials");
//	                	}	                    
//	                   	                    break;
//	                case 5:
//	                    System.out.println("Show All Users selected");
//	                   
//	                    
//	                    
//	                    for(User obj : Users)
//	                    {
//	                    	System.out.println(obj.toString());
//	                    }
//	                    break;
//	                case 6:
//	                    System.out.println("Exiting the application. Goodbye!");
//	                    break;
//	                default:
//	                    System.out.println("Invalid choice. Please try again.");
//	            }
// 
//	        } while (choice != 6);
// 
//		
//		
//		
//		
		
		CredentialFns fn1=new UserPage();
		fn1.signup();
		fn1.login();
		fn1.logout();
		
		CredentialFns fn2=new AdminPage();
		fn2.signup();
		fn2.login();
		fn2.logout();
 
	}
 
}
 
 