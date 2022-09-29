package com.syntax.class4;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// scanner is a class that helps us take the input from the keyboard
		/*it contains many different smaller modules called methods that can help us take data from the keyboard
		 *  write: java.util.Scanner; 
		 */

		Scanner input=new Scanner(System.in); 
		System.out.println("Please enter your name");// a message will be displayed to user to enter name
		String name=input.next(); //activates the java to take the input from keyboard and store inside name variable
		
		System.out.println("Hello "+name+" dont be confused"); //prints Hello+ whatever name user entered on the keyboar
		
	
		
	}

}
