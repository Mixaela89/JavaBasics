package com.syntax.class03;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myMonth=1;
		if (myMonth ==1) {System.out.println("It's January");}
		else if(myMonth==2) {System.out.println("It's February");}
		else if(myMonth==3) {System.out.println("It's March");}
				
		else {System.out.println("enter a valid month");}
		
		int num=-4;
		if(num>0) {System.out.println("The number"+" "+num+"is positive");}
		else {System.out.println("the number is negative");}
		
		int number=-7;
		int num2=2;
		if (number%num2==0) {System.out.println("the number is even");}
		else {System.out.println(" the number is odd");}
		
		
		int money =2; int mood=0; 
		if(money>1) {mood=2;}
		
		System.out.println(mood);
	}

}
