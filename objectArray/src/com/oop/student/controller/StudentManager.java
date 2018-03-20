package com.oop.student.controller;

import java.util.Scanner;

import com.oop.student.model.vo.Student;

public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	private Student[] students = new Student[3];
	
	Student e = new Student();
	public StudentManager(){
		
	}
	public void insertStudentData(){
		int grade = 0;
		int classroom = 0;
		int stdtNo = 0;
		String name = " ";
		
	 for(int i = 0; i<students.length; i++){
		System.out.print("학년:");
		grade = sc.nextInt();
		System.out.print("반:");
		classroom = sc.nextInt();
		System.out.print("번호:");
		stdtNo = sc.nextInt();
		System.out.print("이름:");
		name = sc.next();
		
		students[i] = new Student(grade, classroom, stdtNo, name);
		
		}
	 
		
		
	}
	public void printStudentData(){
		for(int i=0; i<students.length; i++){
			System.out.println(students[i].information());
		}
	
	}
	
	

}

