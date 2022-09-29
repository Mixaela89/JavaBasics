package com.syntax.class4;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in); 
		System.out.println("Do you have a credit card, please enter true or false");
		
		boolean card=scanner.nextBoolean(); 
		
		if(card) {
			
			System.out.println("what is the balance on the card?");
			int balance=scanner.nextInt(); 
			if(balance>1000) {
				System.out.println("Please pay it off immidiately");
			}
			else {System.out.println("you can spend more");}
		}
		
		else {
			System.out.println("would you like to open a card with us?"); 
			
		}
		
		
	}

}
