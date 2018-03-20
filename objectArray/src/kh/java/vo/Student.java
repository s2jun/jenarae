package kh.java.vo;

public class Student {
	private String name;
	private double point;
	private char gender;
	
	public Student(){
	}
	
	public Student(String name, double point, char gender){
		this.name = name;
		this.point = point;
		this.gender = gender;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setPoint(double point){
		this.point = point;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public String getName(){
		return name;
	}
	public double getPoint(){
		return point;
	}
	public char getGender(){
		return gender;
	}
	
	public void printInfo(){
		System.out.println(name+", "+point+", "+gender);
	}

}
