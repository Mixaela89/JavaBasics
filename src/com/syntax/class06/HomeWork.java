package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// hm1
		
		Scanner console=new Scanner(System.in); 
		System.out.println("where are u from?");
		String country=console.nextLine(); 
		String language; 
		switch (country.toLowerCase()) { // to conver all entry to lower case in case someone enters with different Cap
		case "Japan":
			language="japanese"; 
			break;
			
		default: 
			language="unknown";
			break; 
			
		case "Spain":
			language="spanish";
			break;	
			} System.out.println(language);
			
			
			if(country.equals("Spain")) {
				language="Spanish";
			}
			
			else if(country.equals("Japan")) {
				language="Japanese";
			}
			
			System.out.println(language);
			

		//HM2
			
			Scanner cons=new Scanner(System.in); 
			System.out.println("enter your grade");
			char grade=cons.next().charAt(0);
			
			String explnationOfGrade; 
			
			switch(grade) {
			case 'A': 
				explnationOfGrade="Excellent";
			break;
			
			case 'B': 
				explnationOfGrade="Good";
			break;
			
			case 'C': 
				explnationOfGrade="Average";
			break;
	
			case 'D': 
				explnationOfGrade="Bad";
			break;
			
			default: 
				explnationOfGrade="Not Acceptable";
			break;	
			
			
	}
			System.out.println("Your grade is " + grade+" and that is "+ explnationOfGrade+" grade.");
			
			if(grade=='A') {
				explnationOfGrade="Excellent";
			}
			else if(grade=='B') {
				explnationOfGrade="Good";
			}
			
			else if(grade=='C') {
				explnationOfGrade="average";
			}
			
			System.out.println("Your grade is " + grade+" and that is "+ explnationOfGrade+" grade.");
	}
}
