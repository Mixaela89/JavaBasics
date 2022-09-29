package com.syntax.class08;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		// 1-50 please find the sum of all even and all odd numbers 
		int sum=0; 
		for (int n=1; n<=50; n++) {
			if (n%2==0) {
				sum +=n;
				} 
				
			}
		System.out.println(sum);
		
		// odd 
		int sum1=0;
		for (int n=1; n<=49; n+=2) {
			 {
				sum1 +=n;
				} 
				
			
		System.out.println(sum1);
		
		//best way 
		
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
		
		
		
		
		// secret number let user guess it
		
		Scanner inp=new Scanner(System.in); 
		
		
		int secretNumber=9; 
		 
		        int numberEntered;
		       
				do { System.out.println("pls enter the secret number");
		        	 numberEntered=inp.nextInt();   
		        	 
		        	 
		        } while (secretNumber!=numberEntered); 
		
		     System.out.println("you won!!!");   
		     
	
		}	     
		}
		

}

