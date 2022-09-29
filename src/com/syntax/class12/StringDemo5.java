package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="I love Java"; 
		System.out.println(str.charAt(2)); // to print any char from string
		// * charAt returns us the character at a specific index  
		
		for  (int i=0; i<str.length(); i++ ) {
			if(!(str.charAt(i)==' ')) { // to avoid spaces 
				System.out.println(str.charAt(i));
			}
			
		}

	}

}
