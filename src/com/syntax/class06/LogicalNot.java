package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		// ! operator revsrses the statement 

		boolean boo=!true; //false 
		System.out.println(boo);
		
		boolean rain=false; 
		if(!rain) {
			System.out.println("i will go for a walk ");
		}
		
		String day="friday";
		if(!day.equals("sunday")){
			System.out.println("today is not sunday");
		 }
		
		// how to make code more neat 
		
		int n1=100; int n2=100; int n3=100; 
		int largest=2; //need to add default value for java to work, int = 0; boolean = false;
		/*double=0.0;
		 *String and other non primitive =null
	 */
		
		if (n1>n2 && n1>n3) {
			largest =n3;
		}
		else if (n2>n1 && n2>n3) {
			largest =n2;
		}
		
		else if (n3>n1 && n3>n2) {
			largest =n3;
		}
		
		if (largest!=0) {
		if (largest%2==0) {
			System.out.println(largest + " is even number");
		} else {System.out.println(largest + " is odd number");}}
		
	}

}
