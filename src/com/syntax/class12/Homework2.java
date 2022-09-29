package com.syntax.class12;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not
empty perform the following:
○ if the String has an odd number of
characters and has 3 or more
characters, print the character in the
middle of the String.
		 */

		String str= "Hello"; 
		if(!str.isEmpty()) {
			if((str.length()%2==1)&&str.length()>3) {
				System.out.println(str.charAt(str.length()/2));
			}
		}
		
	}

}
