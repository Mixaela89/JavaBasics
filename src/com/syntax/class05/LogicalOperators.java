package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		// assignment operator = 
		// arithmetic +- * / % 
		// Relational >< <= >= == != 
		// logical &&and  ||or ! not

		boolean understandJava=false; 
		boolean enjoyJava=true; 
		boolean practice=true; 
		
		if(understandJava &&enjoyJava&&practice) {
			System.out.println("This is awesome");
		}
		
		
		String day="Saturday"; 
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}
		
		double money=120000; 
		String title="Automation tester"; 
		if(title.equals("Automation tester") || money==120000) {
			System.out.println("happy");
		}
		
		
		
		
		
	}

}
