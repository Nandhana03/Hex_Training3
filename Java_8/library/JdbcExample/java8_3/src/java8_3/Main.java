package java8_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
          
	  public static void main(String args[])
	  {
			List<User> users = new ArrayList<>();
			 
	        users.add(new User(1, "Amit", 50000.0));
	        users.add(new User(2, "Priya", 60000.0));
	        users.add(new User(3, "Rahul", 55000.0));
	        users.add(new User(4, "Sneha", 70000.0));
	        users.add(new User(5, "Vikram", 48000.0));
	        users.add(new User(6, "Pooja", 22000.0));
	        users.add(new User(7, "Rohit", 75000.0));
	        users.add(new User(8, "Neha", 58000.0));
	        users.add(new User(9, "Ankit", 54000.0));
	        users.add(new User(10, "Kiran", 67000.0));
	        users.add(new User(11,"ANKIT",55000.0));
	        
//	        List<User> res=users.stream().filter((i)->i.getSalary()>50000).collect(Collectors.toList());
//	        System.out.println(res);
	        
	        
//	        Get the names of users whose names start with the letter 'P'.
	        
//	        users.stream().filter((i)->i.getName().charAt(0)=='P').forEach((i)->System.out.println(i));
////	        
////	        Use Stream API to get a list of users whose salary is greater than ₹60,000.
//	        System.out.println("salary greater than 60000:");
//	        users.stream().filter((i)->i.getSalary()>60000).forEach((i)->System.out.println(i));
////	         
////	        : Get Names of All Users in Uppercase
//	        users.stream().forEach((i)->System.out.println(i.getName().toUpperCase()));
//	   
//	        
////	        Create a Map of user IDs and their names using Stream API.
//	        
//	        Map<Integer,String> userMap = users.stream().collect(Collectors.toMap(i -> i.getUid(),i -> i.getName()));
//	        System.out.println(userMap);
//
////	        Collections.sort(users,(u1,u2)-> u1.getName().compareTo(u2.getName()) );
////	        
////	        users.forEach((e)-> System.out.println(e.toString()));
//	        
////	        Collections.sort(users,(u1,u2)-> u1.getSalary().compareTo(u2.getSalary()));
////	        users.forEach((e)-> System.out.println(e.toString()));
//	        
////	        System.out.println(users.stream().max((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary())));
//            
////	        System.out.println(users.stream().min((u1,u2)-> Double.compare(u1.getSalary(),u2.getSalary())));
	        
//	        Scanner sc=new Scanner(System.in);
//	        System.out.println("Name:");
//	        String name=sc.nextLine();
//	        
//	        users.stream().filter((i)->i.getName().equals(name)).forEach((i)->System.out.println(i.getSalary()));
	        
	        int a[]={4,6,7,3,4,5,6,7};
	        
	        HashSet<Integer> set=new HashSet<>();
	        for(int i=0;i<a.length;i++)
	        {
	        	if(!set.add(a[i]))
	        	{
	        		System.out.println(a[i]);
	        	}
	        }
	        
	        
	        
	        
	  }
}
