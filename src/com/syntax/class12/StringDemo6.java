package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		// toCharArray will convert a String to an array of chars and 
		//store all elements from string to the array
		
		String str="I love Java programming"; 
		char[] charArray=str.toCharArray();
		
		System.out.println(charArray[5]);
		
		System.out.println(Arrays.toString(charArray));//to print all elements
		
		int counter=0; 
		for (char c:charArray) {
			if (c=='a' ) {
				counter ++;
			}
		}
		System.out.println("letter a has appeared "+ counter+ " times");
	}

}
