package com.oop.book.model;

import java.util.Scanner;

public class BookManager {
	private Book[] bar= null;
	private static int count= 0;
	Scanner sc = new Scanner(System.in);
	
	{
		bar = new Book[10];
	}
	
	public void menu(){
		int inputNum = 0;
		do{
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두 출력");
			System.out.println("7. 끝내기");
			inputNum = sc.nextInt();
			switch(inputNum){
			  case 1: bookInput(); break;
			  case 2: bookAllOutput(); break;
			  case 7:  return;
	        }
	    	}while(inputNum!=7);
	        
	}

	public void bookInput(){
		Book b = new Book();
		String title = " ";
		int price = 0;
		double discountRate = 0.0;
		String author= " ";
		
		System.out.print("책 제목: ");
		title = sc.next();
	
		System.out.print("책 가격: ");
		price = sc.nextInt();
	
		System.out.print("할인율: ");
		discountRate = sc.nextDouble();
		
		System.out.print("책 저자: ");
		author = sc.next();
		
		bar[count] = new Book(title, price, discountRate, author);
		count++;
		
	}
	
	public void bookAllOutput(){
		for(int i=0; i<count; i++){
			bar[i].information();
		}
	}
	
}
