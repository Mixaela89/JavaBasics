package com.syntax.class07;

public class Homework1 {

	public static void main(String[] args) {
		// print from 1 to 10 
		
		for (int num=1; num<=10; num++) {
			System.out.print(num +" ");
		}
        System.out.println("                             ");
		// print from 10 to 1
		
		for (int x=10; x>=1; x--) {
			System.out.print(x +" ");
		}
		
		  System.out.println("                             ");	
		// print even numbers from 20 to 1 first way
		
		for (int y=20; y>=1; y-=2) {
			System.out.print(y+ " ");
		}
		  System.out.println("                             ");		
		// 2nd way
		
		for (int z=20;z>=1 && z%2==0; z-=2) {
			System.out.print(z+ " ");
			;
		}
		
		 System.out.println("                             ");		
		//print odd numbers between 20 and 50 1st way
		 
		 for(int n=21; n<=50&&n%2!=0; n+=2) {
			 System.out.print(n+ " ");}
		 System.out.println("                             ");		 
		 // 2nd way 
		 int num=20;
		 while(num<=50) {if (num%2!=0) {
			 
			 System.out.print(num+ " ");}
		 num++;
		 }
		 
	
		 
		 
		 
		 
		 
		 }
		 }

