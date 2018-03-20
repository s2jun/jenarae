package kh.java.run;

import kh.java.controller.StudentManager;

public class Run {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		sm.insertStudent();
		sm.insertStudent();
		sm.insertStudent();
		sm.insertStudent();
		
		sm.printStudentAll();
		sm.deleteStudent();
		sm.printStudentAll();
	}

}
