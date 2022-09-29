package com.syntax.class4;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in); 
		System.out.println("Did u solve the repl assignments please enter true or false");
		boolean solveAnyRepls=scanner.nextBoolean(); 
		
		if(solveAnyRepls) {
			System.out.println("How many Repls you solved?");
			int noOfReplsSolved=scanner.nextInt();
			
			if (noOfReplsSolved>=17) {
				System.out.println("you are doing great");
			}
			else if(noOfReplsSolved>10) {System.out.println("you are doing ok, pease comeplete them asap");}
			else {
				System.out.println("you should solve some more repples");
			}
		}
		
		else {System.out.println(" They are important to learn java, please solve them");}
	}
	

}
