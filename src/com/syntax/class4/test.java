package com.syntax.class4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		System.out.println("What is your gender please enter M or F");
		String gender=inp.nextLine();
		
		
		if (gender.equals("F")) { 
			System.out.println("what is your age");
			int age=inp.nextInt(); 
			 if (age>25) {System.out.println("womanF");}
			 else {System.out.println("GIRL");}		
		}
		
		if (gender.equals("M")) { 
			System.out.println("what is your age");
			int ageM=inp.nextInt(); 
			 if (ageM>25) {System.out.println("MAN");}
			 else {System.out.println("BOY");}
		
		
	}
	}
}
