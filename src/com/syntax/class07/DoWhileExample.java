package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		String answer;
		do {
		System.out.println("did u get a job");
		answer=sc.next();
		
		}while(!answer.equals("yes")); 
		
		System.out.println("congrats");
		
		// same thing with while loop 
		
		System.out.println("did u get a job 2nd ");
		answer=sc.next();
		
		while(!answer.equals("yes")) {
			System.out.println("did u get a job 3rd");
			answer=sc.next();
		}
		
		
	}

}
