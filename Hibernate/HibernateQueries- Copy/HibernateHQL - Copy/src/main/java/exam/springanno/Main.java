package exam.springanno;

import Service.StudentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        //service.saveStudent();
        //service.RemovebyStudRoll();
        //service.showalldata();
        //service.searchStudByName();
        //service.searchStudByNameMarks();
        //service.updateStudentByRoll();
        //service.displayStudentsWithMarksAbove();
        //service.UpdateByName();
        //service.ShowData();
        service.RemovebyRollno();
    }
}