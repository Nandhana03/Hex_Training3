package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
    @NamedQueries({


            @NamedQuery(name="Student.findAll",query ="from Student" ),
            @NamedQuery(name="Removebyroll.findAll",query ="delete from Student where rollno=:rollno" )
    })
    public class Student {
        @Id
        int rollno;
        String name;
        double marks;

        public Student(){

        }

        public Student(int rollno, String name, double marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMarks() {
            return marks;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }


