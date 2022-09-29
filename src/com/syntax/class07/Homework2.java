package com.syntax.class07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// 	 // Ask user name 3 times then say good afternoon +name
		
		Scanner scan=new Scanner(System.in); 
		String name=null;
		
		for (int num=1; num <=3; num++) {
			System.out.println("what is your name?");
			
			name=scan.nextLine();
		}
		 
		System.out.println("good afternoon "+ name);
		
		//coffee 
		
		int coffeePrice = 5; 
		int amountPaid; 
		
		do {
			System.out.println("pls enter the amount of 5$ to pay for this coffee");
		   amountPaid=scan.nextInt();
		   if (amountPaid==coffeePrice) {
			   System.out.println("enjoy your coffee");
		   }
		   else if(amountPaid>coffeePrice) {
			   System.out.println("pls pay less");
		   }
		   else {System.out.println("pls pay more");}
		
		}while(amountPaid!=coffeePrice);
		

	}

}
