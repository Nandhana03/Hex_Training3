package service;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.StudentDao;
import dao.StudentDaoI;
import model.Student;

public class StudentService {
	
	 Student s;
	 StudentDao dao;
	 Scanner sc;

	    public StudentService(){
	        s=new Student();
	        sc=new Scanner(System.in);
	        dao=new StudentDaoI();
	    }
	    public void saveStudent(){
	        System.out.println("enter rollno");
	        s.setRollno(sc.nextInt());
	        sc.nextLine();
	        System.out.println("enter name");
	        s.setName(sc.nextLine());
	        System.out.println("enter marks");
	        s.setMarks(sc.nextDouble());
            
	        dao.saveData(s);

	    }
	  
		public void removeByStudRoll() {
			
	         System.out.println("Enter your rollno:");
	         int rno1=sc.nextInt();
		     dao.removeByRoll(rno1);
		}
		
		public void updateByStudRoll() {
			
	         System.out.println("Enter your rollno:");
	         int rno1=sc.nextInt();
	         System.out.println("Enter your new mark:");
	         double marks=sc.nextDouble();
		     dao.updateByRoll(rno1,marks);
		}
        
		public void searchByStudRoll()
		{
			System.out.println("Enter your rollno:");
	         int rno1=sc.nextInt();
		     dao.searchByRoll(rno1);

		}
		
		public void showStudAll()
		{
			dao.ShowDataNative();
		}
		
		public void searchStudByName()
		{
			System.out.println("Name:");
		    String name=sc.nextLine();
		    dao.searchByName(name);
		}

}
