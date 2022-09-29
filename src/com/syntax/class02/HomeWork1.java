package com.syntax.class02;

public class HomeWork1 {

	public static void main(String[] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values
		//Your program should say. “The __ of 2 numbers __ and  is equal to __”

          double num1=1.5; 
          double num2=3.5;
          double sum=num1+num2;
          double sub=num1-num2;
          double mul=num1*num2;
          double dev=num1/num2;
          
          System.out.println("the summary of 2 numbers "+ num1+" and "+num2+" is equal to "+(num1+num2));
          System.out.println("the subtraction of 2 numbers "+ num1+" and "+num2+" is equal to "+sub);
          System.out.println("the multiplication of 2 numbers "+ num1+" and "+num2+" is equal to "+mul);
          System.out.println("the division of 2 numbers "+ num1+" and "+num2+" is equal to "+dev);
		
		//Write a program to find the square of the number 3.9.  “The square of the  is  “
          
         double num=3.9;
         double square= num*num;
         System.out.println("The square of "+num+" is "+square+"."); // option1
		System.out.println("the square of "+num+" is "+(num*num)+"."); //option2
		
		//print area of perimeter of rectangle with width=5 h=8.
		
		int width=5;
	    int height=8;
	    
	    int perimeter=2*(width+height);
	    int area=width*height;
	    System.out.println("the perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
		
		
		//
		
		
		
		
	}

}
