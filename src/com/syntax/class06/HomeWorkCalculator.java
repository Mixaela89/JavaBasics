package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkCalculator {

	public static void main(String[] args) {
		// hw3 calculator 
           Scanner console=new Scanner(System.in); 
           System.out.println("please enter two numbers");
           double num1=console.nextDouble(); 
           double num2=console.nextDouble(); 
           
           System.out.println("please enter math operator");
		   char operator=console.next().charAt(0); 
		   
		   double result=0.0;
		   // if else 
		   if (operator=='+') {
			   result=num1+num2; 
		   }
		   else if (operator=='-') {
			   result=num1-num2;
		   }
		   
		   else if (operator=='*') {
			   result=num1*num2;
		   }
		   else if (operator=='/') {
			   result=num1/num2;
		   }
		  
		   System.out.println(result);
		   
		   // switch 
		   
		   switch(operator) {
		   case '+': 
			  result=num1+num2;
			  break;
			  
		   case '-': 
				  result=num1-num2;
				  break;
				  
		   case '*': 
				  result=num1*num2;
				  break;	
		   case '/': 
				  result=num1/num2;
				  break;	  
		   }
		   
		   System.out.println(result);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
	

}
