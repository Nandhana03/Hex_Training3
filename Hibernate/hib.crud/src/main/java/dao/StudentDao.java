package dao;

import model.Student;

public interface StudentDao {

	void saveData(Student s);

	void removeByRoll(int s);
	
   void updateByRoll(int rno,double marks);
   
   void searchByRoll(int rno);

   void ShowData();
   
   void searchByName(String name);

void ShowDataNative();
}
