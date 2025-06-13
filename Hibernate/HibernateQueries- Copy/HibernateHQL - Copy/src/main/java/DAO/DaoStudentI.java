package DAO;

import Model.Student;

public interface DaoStudentI {
    public void saveData(Student s);
    public void removeByRoll(int rno);
    public void daoShowData();
    public void SearchByName(String name);
    public void SearchByNameMarks(String name,double marks);
    public void updatebyroll(int roll, String name, double mark);
    public void marksgreaterthan(double minmarks);
    public void updatebyname(String name , int rollno);
    //diff is we used named quries here in this func
    public void showdata();
    public void removebyroll(int rollno);

    }


