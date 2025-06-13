package com.spring.library;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.spring.library.Book;
import com.spring.library.Dept;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
//    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//       User user1 = (User) context.getBean("u1");
//       System.out.println(user1.toString());
       
//       User user2=(User) context.getBean("u2");
//       System.out.println(user2.toString());
    	 
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//  	   Book b=(Book)context.getBean("u1");
//      System.out.println( b.toString() );
//      context.registerShutdownHook();   ----> 2nd int and destroy code
       
//       Book user3=(Book)context.getBean("u1");
       
//       System.out.println(user3.toString());
         	
//         	Dept r=user3.getD();
         	
//         	System.out.println(r.toString());
    	 
//    	 Book b=(Book)context.getBean("b1");
//         System.out.println( b.toString() );
//         context.registerShutdownHook();
    	 
         Book b1 = (Book) context.getBean("b3");
         System.out.println(b1.getSales()); // just to see the map

   }
    }

