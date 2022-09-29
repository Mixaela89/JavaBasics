package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		// loop is statement for block of code that gets repeated 
		
		
       int time=9;
        if (time<12) {
        	System.out.println("good morning");
        }
		
        while(time<12) {
        	System.out.println("good morning");
        	time++; 
        }
        
        
        //print all numbers from 1 to 10
        
        int num=1; 
        while (num<=10) {
        	
        	System.out.print(num+" ");
        	num++;
        }
        // print numbers from 10 to 25 
        int a=10; 
        while(a<=25) {
        	
        	System.out.print(a); // need to place it here 
        	a++; 
        	
        }
        
        int number =20; 
        while (number<=50) {    // all numbers from 20-50 not workinh good why is 20 not printing 
        	
        	System.out.println(number);
        	
        	number++; 
        }
        
        //print all even numbers from 1 to 20
        int broj=2;
        while (broj<=20) {
        	System.out.println(broj);
        	broj+=2; 
        }
        	
        // way 2 
        int i=2;
        while (i<=20) {
        	if (i%2==0) {
        		System.out.print(i);	
        		
        	}
        	i++; 
        }
        
        
        	
        }
        
	}


