package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner input=new Scanner(System.in); 
		 System.out.println("enter your birth month");
		 String month=input.nextLine(); 
		 String monthOfBirth; 
		 
		 if(month.equals("jan")|| month.equals("feb")|| month.equals("march")) {
			 monthOfBirth="winter";
		 }
		 
		 else if (month.equals("april")|| month.equals("may")|| month.equals("june")) {
			 monthOfBirth="spring";}
		 
		 else if (month.equals("july")|| month.equals("aug")|| month.equals("sep")) {
			 monthOfBirth="summer";}
		 else if (month.equals("oct")|| month.equals("nov")|| month.equals("dec")) {
			 monthOfBirth=" winter";}
		 else {System.out.println("invalid month"); 
		 monthOfBirth="ivalid";}
		 
		 System.out.println("you were born in season "+monthOfBirth); 
		 
		 //_________________________________________
		 //task 2 
		 
		
		 
		 int quiz=10; 
		 int midterm=29;
		 int finalPoints=20; 
		
		 double average=((quiz+midterm+finalPoints)/3); 
		 String grade=null; 
		
		 
		 if (average>=90) {
			 grade="A";
		 }
		 if (average>=70 && average <=90) {
			 grade="b";
		 }
		 
		 if (average>=70 && average <=90) {
			 grade="b";
		 }
		 
		 if (average>=50 && average <=70) {
			 grade="c";
		 }
		 
		 if (average<50) {
			 grade="d";
		 }
		
		 System.out.println(grade);
		 
	}		 
          
}
