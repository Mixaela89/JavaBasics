package com.syntax.class02;

public class AritmenticOperators {

	public static void main(String[] args) {
		// +, -, *, /, %
		
		int a=900;
		int b=100;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		int c=10;
		int d=3;
		int sum=c+d;
		int sub=c-d;
		int reminder=c%3; //10/3 what is left is reminder  
				
		System.out.println(sum);
		System.out.println(sub);
		
		int e=10;
		int f=5;
		System.out.println("division ="+e/f);
		System.out.println("remainder = " +e%f);
		System.out.println(reminder);
		
		int div=c/d; 
		System.out.println("div is = "+div);//10/3 = 3.333 is a double not int 
		double num1=10;
		double num2=3;
		System.out.println(num1/num2);// when in double it can calucate decimals 
		double divistest=c/d;// 10/3 it is created in int so result is 3
		System.out.println(divistest); //10/3 it is created in double so res is 3.333
		
		float number1=10.0f;
		float number2=3.0f;
		System.out.println("division of float ="+ number1/number2); //up to 7 decimal numbers with float 
		
		
	}

}
