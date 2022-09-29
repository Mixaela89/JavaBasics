package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName="Olena"; 
		String lastName="Dudka";
		System.out.println(firstName+lastName); // Mostly this is used
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.concat(" ").concat(lastName));
		
		 String str=" ";
		 System.out.println(str.isEmpty()); //boolean returns true if a string is empty even for spaces
		// System.out.println(str is** Bl*ank()); // boolean returns true even if there are spaces
		
	}

}
