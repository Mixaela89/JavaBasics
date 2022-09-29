package com.syntax.class13;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String string=new String("I can't sleep if i don't solve Repls");
		
		String str2="I can't sleep if i don't solve Repls";
		System.out.println(str2.length());
		
		
		/*
        StringBuilder  allows any methods to change the original contents of the 
		variables because StringBuilder is mutable.
         */
       StringBuilder stringBuilder=new StringBuilder("Intellij is great");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        /*
        String does not allow any methods to change the original contents of the 
		variables  because String is immutable
         */
        String str="Intellij ";
        str.toLowerCase();
        System.out.println(str);
        
     
		
           
	}

}
