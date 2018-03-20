package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.Person;

public class PersonController {
	Scanner sc = new Scanner(System.in);
	Person[] pArr = new Person[5];

   public void insertPerson(){	
	   String name = " ";
	   int age = 0;
	   double height = 0.0;
	   double weight = 0.0;
	   int asset = 0;
	   
	for(int i = 0; i<pArr.length; i++){
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.print("키: ");
		height = sc.nextDouble();
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		System.out.print("재산: ");
		asset = sc.nextInt();
		
		pArr[i] = new Person(name, age, height, weight, asset);
	}
 }	
   public void printPerson(){
	 for(int i =0; i<pArr.length; i++){
		pArr[i].information();
	}
	
   }
   public void printAvgPerson(){
	   int avgAge = 0;
	   double avgHeight = 0.0;
	   double avgWeight = 0.0;
	   int avgAsset = 0;
	   for(int i =0; i<pArr.length; i++){
		   avgAge += pArr[i].getAge();
		   avgHeight += pArr[i].getHeight();
		   avgWeight += pArr[i].getWeight();
		   avgAsset += pArr[i].getAsset();
	   
	   }
	   System.out.println("평균나이: "+avgAge/pArr.length+"평균 키: "+avgHeight/pArr.length+"평균 몸무게: "+avgWeight/pArr.length+"평균 재산: "+avgAsset/pArr.length);
	
   }
}

