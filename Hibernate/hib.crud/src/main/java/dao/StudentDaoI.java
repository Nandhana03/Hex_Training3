package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import connection.StudentConnection;
//import jakarta.transaction.Transaction;
import model.Student;

public class StudentDaoI implements StudentDao{
	
SessionFactory factory;

	public StudentDaoI() {
	
		factory=StudentConnection.getSessionFactory();
	}

	public void saveData(Student s) {
	      Session session=factory.openSession();
	      Transaction txt=session.beginTransaction();
	      session.save(s);
	      txt.commit();
	}
	
	@Override
	public void removeByRoll(int rno) {
		
        Session session=factory.openSession();
		
		Transaction txt=session.beginTransaction();
		
		Student s= session.find(Student.class, rno);
		
		if(s==null)
		{
			System.out.println("Not Found");
		}
		else 
			{
				session.delete(s);
			}
		txt.commit(); 
	    session.close();
	}
	
	public void updateByRoll(int rno,double marks)
	{
        Session session=factory.openSession();
		Transaction txt=session.beginTransaction();
		Student s= session.find(Student.class, rno);
		if(s==null)
		{
			System.out.println("Not Found");
		}
		else
		{
			 s.setMarks(marks); 
	         session.update(s); 
	         txt.commit();
		}
	}
	
	public void searchByRoll(int rno)
	{
		Session session=factory.openSession();
	    Student rs=	session.get(Student.class, rno);
	    if(rs!=null)
	    {
	    	System.out.println(rs.toString());
	    }
	    else {
	    	System.out.println("Not Found");
	 
	    	
		}
	}
	
	@Override
	public void ShowData() {
		
		
		Session session=factory.openSession();
		 Query<Student> query= session.createQuery("from Student");
		
	List<Student> students=	 query.list();
 
	for(Student s : students )	
	{
		System.out.println(s.toString());
		
	}
	}
	
	public void searchByName(String name)
	{
		Session session=factory.openSession();
		Query<Student> query = session.createQuery("from Student where name = :name", Student.class);
		query.setParameter("name", "Nandha"); 
		List<Student> students=	 query.list();
		 
		for(Student s : students )	
		{
			System.out.println(s.toString());
			
		}
	
	}

	@Override
	public void ShowDataNative() {
		// TODO Auto-generated method stub
		
	}
 

}
 

	

 
 


