package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Mihaela";
		String lastname="Stojanova";
		char grade='A';
		String city="nyc";
		String state="ny";
		String phonenumber="101-202-3003";
		
		System.out.println("My name is " +name+ " and my last name is "+lastname);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in "+ city+", "+state);
		System.out.println("And my phone number is "+phonenumber);
		
		//updated info 
		city="miami"; 	state="fl";  grade='B';  phonenumber="1800-555-3000";
		System.out.println(" ");
		System.out.println("My name is "+name+ " and I moved to "+ city+" "+ state+". "+"My new phone number is " +phonenumber);
	
		//RULES for indentifiers (names for variables methods class)  
		// 1. cant use key words as identifiers (around 50 key words in jAVA, EX STRING BYTE ETC)
		//2. cant have spaces in identifiers 
		//3. identifier cant start with number: int 1number=123; -cant use this example
		/* 4. indentifiers cant contain any special character
		 * except $ or _   ex: double $price=9.99; allowed 
		 */
	/* PREFERENCE - NAMING CONVENTIONS 
	 * 1. Class should start with upper case and follow camelcase ex: NewClass 
	 * 2. every variable is written in lower case and follow camelcase
	 * 3. packages methods variables start with Lower case 
	 */
		
		
		

	}

}
