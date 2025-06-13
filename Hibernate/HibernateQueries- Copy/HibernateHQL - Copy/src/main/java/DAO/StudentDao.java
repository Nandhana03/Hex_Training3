package DAO;
import Connection.StudentConn;
import Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao implements DaoStudentI {
    SessionFactory factory;

    public StudentDao() {

        factory = StudentConn.getSessionFactory();
    }


    @Override
    public void saveData(Student s) {

        Session session = factory.openSession();
        Transaction txTransaction = session.beginTransaction();
        session.save(s);
        txTransaction.commit();


    }

    @Override
    public void removeByRoll(int rollno) {

        Session session = factory.openSession();

        Transaction txt = session.beginTransaction();
        NativeQuery Q = session.createNativeQuery("delete from Student where rollno = :rollno" , Student.class);
        Q.setParameter("rollno", rollno);
        System.out.println("Trying to delete rollno: " + rollno);
        int r = Q.executeUpdate();
        if (r > 0) {
            System.out.println("Removed");
        } else {
            {
                System.out.println("Not Found");
            }

        }
        txt.commit();
        session.close();
    }

    @Override
    public void updatebyname(String name, int rollno) {

        Session session = factory.openSession();

        Transaction txt = session.beginTransaction();
        NativeQuery Q = session.createNativeQuery("update Student set name=:name where rollno=:rollno");
        Q.setParameter("name", name);
        Q.setParameter("rollno" , rollno);
        int r = Q.executeUpdate();
        if (r > 0) {
            System.out.println("Updated");
        } else {
            {
                System.out.println("Not Found");
            }

        }
        txt.commit();
        session.close();
    }

    @Override
    public void daoShowData() {
        Session session=factory.openSession();


        NativeQuery<Student> query=session.createNativeQuery("select * from Student", Student.class);

        List<Student> usersList=query.list();





        List<Student> students=	 query.list();

        for(Student s : students )
        {
            System.out.println(s.toString());

        }


    }



    @Override
    public void SearchByName(String name) {
        Session session = factory.openSession();
        Query<Student> Q = session.createQuery("from Student where name=:name", Student.class);
        Q.setParameter("name", name);
        List<Student> usersList = Q.list();

        for (Student u : usersList) {
            System.out.println(u.toString());
        }
    }

    @Override
    public void SearchByNameMarks(String name, double marks) {
        Session session = factory.openSession();
        Query<Student> Q = session.createQuery("from Student where name=:name and marks=:marks ", Student.class);
        Q.setParameter("name", name);
        Q.setParameter("marks", marks);
        List<Student> usersList = Q.list();

        for (Student u : usersList) {
            System.out.println(u.toString());
        }
    }


    @Override
    public void updatebyroll(int roll, String name, double mark) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, roll);

        if (student == null) {
            System.out.println("Student with roll no " + roll + " not found.");
        } else {
            student.setName(name);
            student.setMarks(mark);
            session.update(student);
            tx.commit();
            System.out.println("Student updated successfully.");
        }

        session.close();
    }

    //marks greater than user marks
    @Override
    public void marksgreaterthan(double minimarks) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        List<Student> student = session.createQuery("from Student", Student.class).list();
        student.stream().filter(i -> i.getMarks() > minimarks).forEach((i) -> System.out.println(i));
        tx.commit();
        session.close();
    }
    public void showdata(){
        Session session=factory.openSession();


        Query<Student> query=session.createNamedQuery("Student.findAll", Student.class);

        List<Student> usersList=query.list();





        List<Student> students=	 query.list();

        for(Student s : students )
        {
            System.out.println(s.toString());

        }

    }
    @Override
    public void removebyroll(int rollno){
        Session session = factory.openSession();

        Transaction txt = session.beginTransaction();
        Query <Student> Q = session.createNamedQuery("Removebyroll.findAll" , Student.class);
        Q.setParameter("rollno", rollno);
        System.out.println("Trying to delete rollno: " + rollno);
        int r = Q.executeUpdate();
        if (r > 0) {
            System.out.println("Removed");
        } else {
            {
                System.out.println("Not Found");
            }

        }
        txt.commit();
        session.close();

    }
}









