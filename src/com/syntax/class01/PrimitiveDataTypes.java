package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		//storing and representing whole number
		byte box1 = 20; 
			
		//20 is a whole number data value, in order to use it you have to store it in container /variable
		//and the byte is the type of numeric data type for whole number
						
		 short box2=100;
									
		int box3=10000; //most popular 
		
		long box4=1000000000l;//add L to specify it is being long 
			
		//storing and representing decimal numeric values 
		float variable1=1.99F;  //smaller data add F 
		double variable2=99.99; // bigger data do not add D - popular 
		
		//storing non numeric single characters values  
		
		char container1='a'; // dont use ""
		char dollar='$';
		
		//storing non numeric yes/no values 
		
		boolean hot=true; 
		boolean tired=false; 
		
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(variable1);
		System.out.println(container1);
		System.out.println(dollar);
		System.out.println(hot);
		System.out.println(variable2); //access the value throgh the variable 
		System.out.println(tired);
		
		
	}

}
