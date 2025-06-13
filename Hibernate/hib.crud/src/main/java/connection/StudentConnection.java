package connection;
 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
import model.Student;
 
 
public class StudentConnection {
 
	
	
	private static SessionFactory  sessionFactory;
	
	StudentConnection()
	{
		sessionFactory= new Configuration().configure("hiber.config.xml").addAnnotatedClass(Student.class).buildSessionFactory();
 
	}
	
	
	public static SessionFactory getSessionFactory() {
		
		StudentConnection studentConn= new StudentConnection();
		
		
		return  sessionFactory;
	}
	
	
}
 
 