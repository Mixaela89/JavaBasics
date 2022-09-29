package com.syntax.class08;

public class Homework {

	public static void main(String[] args) {
		//digital clock with nested loops
		
	//	for (int h=0; h<24; h++) {
	
			
		//	for (int m=0; m<60; m++) {
			//System.out.println(h+":"+ m);
			//	}
		
		//	}
		System.out.println("                                                    ________________");
	// digital clock with 2 digits
		
		for (int a=0; a<3; a++) {	
			for (int b=0; b<10; b++) {
				if (a==2&& b==4 ){
					break;}
			for (int c=0; c<6; c++)	{
			for (int d=0; d<10; d++) { 
				
				System.out.println(a+""+b+":"+c+""+d+"h");
				
				}
				
			
			
			}	
			}
				
			}
			
		}
	}


