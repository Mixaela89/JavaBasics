package com.syntax.class09;

public class Homework2 {

	public static void main(String[] args) {
		//task 3 create array of int and calculate the sum
		
		int[] numbers= {1,5,7,10}; 
		int sum=0; 
		for (int i=0; i<numbers.length; i++) {
			sum= sum+numbers[i]; // or sum +=numbers[i]; 
		}
		
		// enhanced:  for (int number:numbers) {
		//    sum+=number; }
		
		System.out.println(sum);
		
		
		
	//	form array of int and find largest number
		
		int [] num= {1, 19, 300, 300};
		int largest=0; 
		for (int i=0; i< num.length; i++  ) {
			if (num[i]>largest) {
				largest=num[i];}
			}
		System.out.println(largest);
		
		int largestnum=num[0];
		for(int n:num) {
			if(n>largestnum ) {
				largestnum=n; 
			}
		}
		
		System.out.println(largestnum);
		
		// string ex
		String[] week= {"mon","sun",  "tues","thur", "fri" };
		 for (String day:week) {
			 if(day.equals("sun")) {System.out.println(day+" is fun day");}
			 else { System.out.println(day+" is borig day");}
		 }
		
		
		 // array of char and print in reverse order 
		 
		 char [] letters= {'a', 'b', 'c', 'd'}; 
		 for (int i=letters.length -1; i>=0; i--) // we need to say -1 because indexes start with 0
		 {System.out.println(letters[i]);}
		 
		}

	}


