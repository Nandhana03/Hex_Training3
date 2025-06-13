package MavenJdbcExample.JdbcExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.example.com.springEx.Address;
import com.spring.example.com.springEx.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("s1");
        Student student1 = (Student) context.getBean("s2");
        Student student2 = (Student) context.getBean("s3");
//        student.display();
//        Student s1=(Student)con.getBean("s1");
        
//        System.out.println(student2.toString());
        
        Student s4=(Student)context.getBean("s4");
        
        System.out.println(s4.toString());
          	
          	Address a=s4.getA1();
          	
          	System.out.println(a.toString());
    }
}
