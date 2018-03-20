package com.oop.person.model;

public class Person {
	String name;
	int age;
	double height;
	double weight;
	int asset;
	
	public Person(){
		
	}
	public Person(String name, int age, double height, double weight, int asset){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.asset = asset;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAsset() {
		return asset;
	}
	public void setAsset(int asset) {
		this.asset = asset;
	}
	
	public void information(){
		System.out.println(name+", "+age+", "+height+", "+weight+", "+asset);
	}

}

