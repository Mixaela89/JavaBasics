package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		//type casting is converting one data type to another data type
		// why should i learn - so that we can use the code that is written by others
		// or when we will be working in teams we will be able to merge the code 
		// the syntax for type casting: smaller to bigger not doing anything, it is automated by java
		//ex: int box=1234; long box2=box; - this will work automatically aka widening or implicit or automatic
		// when we convert larger data type to smaller data type need to use ()
		// long box=1254545; int box2=(int)box; aka narrowing, explicit or manual conversion
		
		byte box1=127; //smallest 
		short box2=3333; //double the size of box1 in terms of bits 16bits
		
		//int =number=15.2; //32 bits- large box most commonly used
		//we cant store the decimal number in box of type int
		
		long box4=45465454; //slightyl larger box 
		float box5=415656565; //larger box
		double box6=454545; //LARGEST
		
		int number1=(int)15.2; //type casting we lose the decimal from the double 
		System.out.println(number1);
		
		short biggerBox=box1;//we can convert smaller data type to bigger without issue
		System.out.println(biggerBox);
		
		long box7=box1; //ok to do, fitting smaller data type into bigger box 7 larger than box 1
		float box8=(float)box6; //box 6 is larger than box8 it is double we need to type cast 
		System.out.println(box8); //type castig sometimes gives unpredictable result
		
		char a=(char)66; 
		System.out.println(a); //65 is A in computer - 66 is B etc ref to ascii table  
		 int box9=(int)box4; // need to convert long into int to make java run it 
        System.out.println(box9);
        
        
	}

}
