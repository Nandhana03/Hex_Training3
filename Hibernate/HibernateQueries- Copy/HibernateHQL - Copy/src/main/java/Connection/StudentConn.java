package Connection;
import Model.Student;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentConn {

        //make it static so that it is one connection for all CRUD operations
        private static SessionFactory sessionFactory;

        public StudentConn(){
            sessionFactory= new Configuration().configure("hiber.config.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        }

        public static SessionFactory getSessionFactory() {
            StudentConn s = new StudentConn();


            return sessionFactory;
        }
    }








