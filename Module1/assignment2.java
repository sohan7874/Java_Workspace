//asssignment 2 use uservalue input


package com.mod1;

import java.util.Scanner;

public class assignment2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//TASK-1 given years leap years  or not
	
	
	
	
	
	/*  
	 int year=sc.nextInt();
	
	
	if(year%4==0) {
		
	System.out.println("yes "+year+" year is leap year");
	
	}
	else {
		
		System.out.println("no given years not a  leap year");
	}
	
	
	*/
	
	
	
	//TASK -  2 Write a program to find the Max number from the given three number using Nested If
	/*
	
	
	
	
	
	System.out.println("plz  enter the number 1");
	int number1=sc.nextInt();
	System.out.println("plz  enter the number 2");
	int number2=sc.nextInt();
	System.out.println("plz  enter the number 3");
	int number3=sc.nextInt();
	
	if(number1<number2) {
		
		if(number2<number3) {
			System.out.println("the number 3 is maximum");
		}
		if(number2>number3) {
			System.out.println("the number 2 is maximum");
		}
	}
	
if(number1>number2) {
		
		if(number1<number3) {
			System.out.println("the number 3 is maximum");
		}
		if(number1>number3) {
			System.out.println("the number 1 is maximum");
		}
	}
	
	*/
	
	
	//TASK-3Write a program user enter the 5 subjects mark. You have to make a totaland find the percentage.
	//percentage > 75 you have to print “Distinction”
	//percentage > 60 and percentage <= 75 you have to print “First class”
	//percentage >50 and percentage <= 60 you have to print “Second class”
	//percentage > 35 and percentage <= 50 you have to print “Pass class”
	//Otherwise print “Fail”
	
	
	
	
	
	
	/*
	
	
	
	
	
	System.out.println("plz  enter the physics mark ");
	int phy=sc.nextInt();
	System.out.println("plz  enter the maths mark");
	int maths=sc.nextInt();
	System.out.println("plz  enter the chemical mark");
	int chemical=sc.nextInt();
	System.out.println("plz  enter the compter mark ");
	int com=sc.nextInt();
	System.out.println("plz  enter the biology mark ");
	int bio=sc.nextInt();
	int total= phy+maths+chemical+bio+com;
	float percentage =total/5F;
	System.out.println("the percentage is "+percentage);
	
	
	if(percentage>75) {
		System.out.println("DISTINCTION");
	}
		if(percentage<=75) {
			
			if(percentage>60&&percentage<=75) {
				System.out.println("FIRST CLASS");
			}
				if(percentage>50&&percentage<=60) {
					System.out.println("SECOND CLASS");
				}
					if(percentage>35&&percentage<=50) {
						System.out.println("PASS");
						
			}
		}
				else {
					System.out.println("FAIL");
				}
				
	
	
	
	
	
	*/
	
	
	// Task-4 =swich case using print monday to sunday
	
	
	/*
	System.out.println("enter the num");
	int i=sc.nextInt();
	if(i<=7) {
	switch(i) {
	
	case 1  : System.out.println("monday");
	          break;
	case 2  : System.out.println("tuesday");
	           break;
	case 3  : System.out.println("wednesday");
	           break;
	case 4  : System.out.println("thursday");
	           break;
	case 5  : System.out.println("friday"); 
	          break;
	case 6  : System.out.println("satday"); 
	          break;
	case 7  : System.out.println("sunday");
	          break;
	 }
	
	}
	else {
		System.out.println("plz enter numberr betweeen  1 to 7");
	}
	
	*/
	
	
	
	//  task  -5 =swich case to add, multi,division,substract 
	
	
	/*
	System.out.println("enter the 1st num ");
	int a= sc.nextInt();
	
	System.out.println("enter the 2st num ");
	int b=sc.nextInt();
	
	

	System.out.println("enter the num what is perform giving a this num");
	int i=sc.nextInt();
	
	switch(i){
		case 1 : System.out.println(a+b);
		         break;
		case 2 : System.out.println(a-b);
		         break;
		case 3 : System.out.println(a*b);
		         break;
		case 4 : System.out.println(a/b);
		         break;
		
	}
	
	
	*/
	
	
	
	
	//Task-5 using swich case  to find out a area of triangle  rectangle,circle
	//1/2*b*h ,l*b,2*pi*r
	


	System.out.println("enter the num what is perform after to taken a vallue");
	int i=sc.nextInt();
	
	switch(i){
		case 1 : System.out.println("rectangle area ");
		         System.out.println("enter the width num ");
		         int b= sc.nextInt();
		
	          	System.out.println("enter the length num ");
		        int l=sc.nextInt();
		        System.out.println(l*b);
		         break;
		case 2 : System.out.println("circle area");
		        System.out.println("enter the radious num ");
                int r=sc.nextInt();
                System.out.println(2*3.14*r);
		         break;
		case 3 : System.out.println("triangle area");
		        System.out.println("enter the width num ");
		        int b1= sc.nextInt();
	 	
	        	System.out.println("enter the hight num ");
		        int h1=sc.nextInt();
		System.out.println((b1*h1)/2);
		         break;
	
	}			
	





}

}




