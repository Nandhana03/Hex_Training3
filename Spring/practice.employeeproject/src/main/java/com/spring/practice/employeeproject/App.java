package com.spring.practice.employeeproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         // task - 1 -- XML based dependency injection
//     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//     Employee emp1 = (Employee) context.getBean("e1");
//      System.out.println(emp1.toString());
    	
// --------------------------------------------------------------------------------------------------- 
    	
      // task - 2 -- Java based configuration
    	
//   ApplicationContext context1= new AnnotationConfigApplicationContext(AppConfig.class);
// 	  Employee emp2=(Employee)context1.getBean("e2");
//  	  System.out.print(emp2.toString());
    	
//-----------------------------------------------------------------------------------------------------
    	
  	  //task -3 -- bean lifecycle (postconstruct and preconstruct)
    	
//  	 AbstractApplicationContext context2= new ClassPathXmlApplicationContext("beans.xml");
//  	 Employee1 emp3=(Employee1)context2.getBean("e3");
//  	 System.out.println(emp3.toString());
//  	  context2.registerShutdownHook();

//-------------------------------------------------------------------------------------------------------------
    	
  	  //task -4  -- initializing bean ,disposable bean 
  	AbstractApplicationContext context3 = new ClassPathXmlApplicationContext("beans.xml");
  	Employee1 emp4 = (Employee1) context3.getBean("e4");
  	System.out.println(emp4);
  	context3.close(); 


    }
}
