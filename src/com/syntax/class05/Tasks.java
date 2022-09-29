package com.syntax.class05;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		/*Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
		 * 
		 */

		Scanner inp=new Scanner(System.in); 
		System.out.println("how tall are you, in in? ");
		double height=inp.nextDouble(); 
		  if (height<60) {System.out.println("short");}
		  else if (height>=60 && height<=72) {System.out.println("medium");}
		  else if(height>72) {System.out.println("tall");}
		
		
		  
		 
		int  day=7; 
		  if(day>=1 && day<=5) {System.out.println("its a weekday");}
		  else if (day==6 || day==7) {System.out.println("its a weekend");}
		  else {System.out.println("invalid day");}
		  
		  System.out.println("Enter a number"); 
		  Scanner input=new Scanner (System.in);
		  int number=input.nextInt();
		  
		  
		  if (number<=1 && number>=10) {System.out.println("small");}
		  else if (number>=11 && number <=100) {System.out.println("medium");}
		  else if (number>=101 && number <=1000) {System.out.println("large");}
		  
	}

	
	
	
}
