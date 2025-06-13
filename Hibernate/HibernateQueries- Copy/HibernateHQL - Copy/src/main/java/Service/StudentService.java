package Service;

import DAO.StudentDao;
import Model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class StudentService {
    Student s;
    StudentDao dao;
    Scanner sc;

    public StudentService(){
        s = new Student();
        sc=new Scanner(System.in);
        dao=new StudentDao();


    }
    public void saveStudent(){
        System.out.println("Enter the rollno: ");
        s.setRollno(sc.nextInt());
        System.out.println("Enter the name: ");
        sc.nextLine();
        s.setName(sc.nextLine());
        System.out.println("Enter the marks: ");
        s.setMarks(sc.nextDouble());
        dao.saveData(s);

    }
    public void RemovebyStudRoll(){
        System.out.println("Enter your rollno");
        int rollno=sc.nextInt();
        dao.removeByRoll(rollno);
    }
    public void showalldata(){

        dao.daoShowData();
    }
    public void searchStudByName(){
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        dao.SearchByName(name);
    }

    public void searchStudByNameMarks(){
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the marks ");
        double marks=sc.nextDouble();
        dao.SearchByNameMarks(name,marks);
    }

    public void updateStudentByRoll() {
        System.out.print("Enter roll no to update: ");
        int rollno = sc.nextInt();

        System.out.print("Enter new name: ");
        String name = sc.next();

        System.out.print("Enter new marks: ");
        double marks = sc.nextDouble();
        dao.updatebyroll(rollno, name, marks);
    }
    public void UpdateByName(){
        System.out.print("Enter new name: ");
        String name = sc.next();
        System.out.println("Enter the rollno of the student to update: ");
        int rollno = sc.nextInt();
        dao.updatebyname(name,rollno);

    }
    public void displayStudentsWithMarksAbove() {
        System.out.print("Enter minimum marks to filter: ");
        double minimarks = sc.nextDouble();
        dao.marksgreaterthan(minimarks);
    }

    public void ShowData(){
        dao.showdata();
    }
    public void RemovebyRollno(){
        System.out.println("Enter your rollno");
        int rollno=sc.nextInt();
        dao.removeByRoll(rollno);

    }
}

