package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Batch 14 is good";
		System.out.println(str.replace("good", "excellent"));
		System.out.println(str); 
		System.out.println(str.replaceAll("[a-z]", " ")); // to replace lower cases with space 

	}

}
