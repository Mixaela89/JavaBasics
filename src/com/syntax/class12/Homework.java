package com.syntax.class12;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*Write a program that reads two people's first
            names and if they expecting boy or girl?
            Based on the input suggests a name for a baby:
		 * 
		 */

		Scanner scan=new Scanner (System.in); 
		String nameMom=scan.next(); 
		String nameDad=scan.next(); 
		System.out.println("are u expecting a boy or girl/ m or f");
		String gender=scan.next(); 
		
		String suggestedName=null;
		if (gender.equals("f")) {suggestedName= nameMom.substring(0, nameMom.length()/2)+nameDad.substring(nameDad.length()/2);}
		else if (gender.equals("m")) {suggestedName=nameDad.substring(nameDad.length()/2)+ nameMom.substring(0, nameMom.length()/2);}
		System.out.println(suggestedName);
		
		
		
		
		
	}

}
