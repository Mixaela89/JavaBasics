package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// only when we deal with arrayes or collections 
		//special loop for each - enhanced 
		
          String[] iceCream= {"vanilla", "chocolate", "pistachio", "kulfi", "mango"};
          for (String flavor:iceCream) {
        	  System.out.println(flavor);
          }
          
          
          char[] letters= {'a','b','c','d','e','f'}; 
          for(char let : letters) {
        	  System.out.print(let);
          }
          
          
          
	}

}
