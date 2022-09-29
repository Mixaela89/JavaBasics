package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=1; 
       while (num<=3) {
    	   System.out.println("I am while loop");
    	   num++; 
       }
		
       int num1=1; 
       do {
    	   System.out.println("I am a DO while loop");
    	   num1++; 
       }while (num1<=3);
       
       
       int i=20; 
       do {
         System.out.print(i); 
         i-=2;
       }while (i>1); 

       
       
		
	}

}
