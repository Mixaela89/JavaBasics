package com.syntax.class4;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma, pls enter true or false");
		boolean diplomaStatus=scanner.nextBoolean();  
		
		if(diplomaStatus) {
			System.out.println("Congratulations!");
			System.out.println("What is your GPA score?");
			
			double gpa=scanner.nextDouble(); 
			if(gpa>=3.5) {
				System.out.println("you are eligable for scholarship");
			}
			else {System.out.println("you should have studied harder");}
		}
	
		
		else {System.out.println("Please get a degree");}
	}

}
