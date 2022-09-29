package com.syntax.class08;

public class Patterns {

	public static void main(String[] args) {
		// outer controls rows inner collumns 

		 for (int i=1; i<=3; i++) {
			 System.out.print("* ");
		 }
		System.out.println();
		 for (int i=1; i<=3; i++) {
			 System.out.print("* ");
		 }
		 
		 
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=3; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		 
	}

}
 