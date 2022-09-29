package com.syntax.class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		
		// string is not primite we cant use == we need to use.equals 

		int time=5; 
		String day="Monday"; 
		
		if (day.equals("Monday")) {  //outer if condition if outer is false then inner wont execute
			if (time>7) {System.out.println("Let's go to the office");} //inner condition
			
		}
		
		if (time<6) {System.out.println("Let's sleep more");}
	}

}
