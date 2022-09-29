package com.syntax.class4;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("What is the amount of loan you want to apply for?");
		int loanAmount=scanner.nextInt();
		
		if(loanAmount<=200000) {
			System.out.println("your loan application has been approved");}
		
		else {System.out.println("your loan application is rejected");}
		
	}

	
		
	}

