package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// 
		
		Scanner keyboard=new Scanner(System.in); 
		System.out.println("enter the current time using 24 h format");

		int currentTime=keyboard.nextInt(); 
		 if(currentTime<=1 && currentTime<=11) {
			 System.out.println("Morning");
		 }
		
		 else if(currentTime>=12 && currentTime<=15) {
			 System.out.println("Afternoon");
		 }
		 else if(currentTime>=16 && currentTime<=20) {
			 System.out.println("Evening");
		 }
		 else if(currentTime>=21 && currentTime<=24) {
			 System.out.println("Night");
		 }
		 
		 System.out.println("enter your birth month");
		 Scanner input=new Scanner(System.in); 
		 String month=input.nextLine(); 
		 if(month.equals("jan")|| month.equals("feb")|| month.equals("march")) {
			 System.out.println("you are born in winter");
		 }
		 
		 else if (month.equals("april")|| month.equals("may")|| month.equals("june")) {
			 System.out.println("you are born in spring");}
		 
		 else if (month.equals("july")|| month.equals("aug")|| month.equals("sep")) {
			 System.out.println("you are born in summer");}
		 else if (month.equals("oct")|| month.equals("nov")|| month.equals("dec")) {
			 System.out.println("you are born in winter");}
	}
	

}
