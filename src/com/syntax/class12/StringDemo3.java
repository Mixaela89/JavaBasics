package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// Method chaining helps us call multiple methods on a single line one 
		//method after an other
           
		String str=" i love java ";
        System.out.println(str);
        /*
         *TRIM Remove the spaces before and after the
         * String but not the ones which are present in between
         */
        System.out.println(str.trim());
		
        String str2="Java is vEry easy"; 
        System.out.println(str2.startsWith("Java")); //boolean
        System.out.println(str2.endsWith("J")); //boolean
        System.out.println(str2.toLowerCase().contains("very"));//boolean method chain
        
        
        
        String name="shah"; 
        
        if (name.equals("Shah")) {  // equals method checks if 2 strings are exactly the same
        	System.out.println("i found it");
        }
        
        if (name.equalsIgnoreCase("shah")) { // ignoreCase checks without case sensitivity
        	System.out.println("i found it with equalsignoreCase");
        }
	}

}
