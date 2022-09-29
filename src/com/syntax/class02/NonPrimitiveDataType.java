package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// STING IS 1 EXAMPLE OF NON PRIM DATA TYPE, String needs to be with cap S
		//to create variable u need data type and name 
		
		String name="Asma";
		String address="123 street";
		int phone=1012586520;
		String phonewithspecialchar="101 258 6520";//spaces are special char needs to be string
		int age=17;
		char character='a';// needs to be single quote
		String letter="a"; //as soon as u use "" needs to be string u cant use "" for primitive values
		
		
		//ctr+space - auto completes the statement
		//syso+ctrl+ space 
		
		System.out.println(name);
		
		// "My name is "Asma" - merge two strings together with + /concotinate (fancy word)
		//to attach any value (int, double,string etc) we use + 
		//+ next to the string acts as concatenation 
		
		System.out.println("My name is "+ name+".");
		
		//Asma is 17
		
		System.out.println(name+" is "+age);
		
		String fruit="apple";
		double price=1.99;
		
		char currency='$'; 
		//the price of the apple is 1.99
		
		System.out.println("The price of the "+fruit+" is " +currency+ +price+".");
		
		fruit="mango";
		price=5.99;
		//The price of mango is 5.99
		System.out.println("The price of the "+fruit+" is " +currency+ +price+".");

		
	}

}
