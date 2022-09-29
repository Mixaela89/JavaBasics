package com.syntax.class08;

public class BreakKeywordAndContinue {

	public static void main(String[] args) {
		// breaks the loop and used with certain condition usually

		for (int i = 1; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("hello");
		}

		

		for (int n = 1; n < 10; n++) {

			if (n == 3 || n == 7 || n == 8) {
				continue;// skip current code goes back to for loop
			}
			System.out.print(n + " ");
		}

		System.out.println("                            ______________________            ");

		// Print numbers from 1 to 50 except those that are divisible by 3
		for (int num = 1; num <= 50; num++) {

			if (num % 3 == 0) {
				continue;
			}
			System.out.print(num + " ");
		}

		
			   
		
		
	}

}
