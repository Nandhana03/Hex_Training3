package com.hibernate.hib.crud;

import service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	StudentService service= new StudentService();
//    	service.saveStudent();
//    	service.removeByStudRoll();
//    	service.updateByStudRoll();
//    	service.searchByStudRoll();
    	service.showStudAll();
//    	service.searchStudByName();
//    	service.removeByStudRoll();
    	
        System.out.println( "Hello World!" );
    }
}
