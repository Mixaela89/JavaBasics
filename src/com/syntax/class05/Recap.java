package com.syntax.class05;

public class Recap {

	public static void main(String[] args) {
		// shortcut to auto complete crtl+space * to auto complete stuff like main method, syso
		
		String phone="Samsung"; 
		if (phone.equals("iphone")) {
			System.out.println("I want to buy it for myself");
		}else if (phone.equals("Samsung")) { 
			System.out.println("I want to buy it for my hubby");
			
		} else if (phone.equals("Nokia")) {
			System.out.println("I want to buy it for my grandma");
		}	else {
			System.out.println("that is not the phone i was looking for");
		}

		boolean allergy=true; 
		
		String allergyType="pollen"; 
		 if (allergy) {
			 System.out.println("let's check what allergy you have");
			 if (allergyType.equalsIgnoreCase("pollen")) { // equals ignore case to take a value regardless of P or p
				 System.out.println("TRy to stay indoors when trees are blooming");
			 } else if  (allergyType.equals("peanut")) {System.out.println("stay away from peanuts");
			 }
				 
			 }
			 
		 
				
		 else {System.out.println("you are lucky");}
		
	}

}
