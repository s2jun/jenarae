package kh.java.controller;

import java.util.Scanner;

import kh.java.vo.Student;

public class StudentManager {
	Scanner sc = new Scanner(System.in);
	Student s = new Student();
	private Student[] sArr = new Student[3]; 
	private int num = 0;
			
	public void insertStudent(){
		if(num<3){
		System.out.print("이름 :");
		String name = sc.next();

		System.out.print("점수 :");
		double point = sc.nextDouble();

		System.out.print("성별 :");
		char gender = sc.next().charAt(0);
		
		sArr[num++] = new Student(name, point, gender);
		}else{
			System.out.println("3명까지 입력가능합니다.");
		}
		
		//입력 받아서 Student 객체를 만들고 배열변수에 할당
		//num++;
		
		// 3명넘을 경우 3명까지입력간응
	}
	
	public void printStudentAll(){
		for(int i =0; i<num; i++){
			sArr[i].printInfo();
		}
		// 저장된 학생 정보 출력
		// printInfo()로 호출
	}
	public void deleteStudent(){
		if(num>3){
		sArr[--num] = null;
		}else{
			System.out.println("삭제할 데이터가 없습니다.");
		}
		
		//마지막칸에 있는 학생을 delete  >>>  null 처리
		//정보가 없을경우 '삭제할 데이터가 없습니다.'
	}
}
