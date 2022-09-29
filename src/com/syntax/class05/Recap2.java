package com.syntax.class05;

import java.util.Scanner; // ctrl+shift+o 

public class Recap2 {

	public static void main(String[] args) {
		// Scanner is a class (like string)needs to start with upper case
		//used to take input from keyboard
         
		
		Scanner input=new Scanner(System.in); //Scanner is object on the right from = we define it 
		System.out.println("pls enter your name");
		
		 String name=input.next(); 
		System.out.println(name);
		
	}

}
