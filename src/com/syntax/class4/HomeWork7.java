package com.syntax.class4;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);  

		System.out.println("Please enter the number of years you have worked for us.");
		int yearsWork=scanner.nextInt(); 
		
		if(yearsWork>=5) {
			System.out.println("You are eligable for bonus!Please enter your salary. ");
			int salary=scanner.nextInt(); 
			if(salary>50000) {System.out.println("You are getting a bonus of 5000");}
			else {System.out.println("You are getting a bonus of 3000");}
		} 
		else {System.out.println(" you are not eligable for the bonus!");}
		
	}

}
