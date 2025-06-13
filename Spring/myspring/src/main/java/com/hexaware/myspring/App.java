package com.hexaware.myspring;

/**
 * Hello world!
 */
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexaware.myspring.*;
//import com.spring.example.com.springEx.Address;
//import com.spring.example.com.springEx.Student;
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        User user1 = (User) context.getBean("u1");
//        System.out.println(user1.toString());
        
//        User user2=(User) context.getBean("u2");
//        System.out.println(user2.toString());
        
        User user3=(User)context.getBean("u3");
        
        System.out.println(user3.toString());
          	
          	Role r=user3.getRole();
          	
          	System.out.println(r.toString());
    }
}
