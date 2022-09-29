package com.syntax.class11;

public class Dog {
           //class have state: attributes - properties-fields /same thing
	
	
		String name;
		String color;
		String breed;
		double weight;
	    int age; 
	
	    void bark() {  // to define behaviour 
	    	
	    	System.out.println("barking... ");
	    }
		
        void sleep() {
        	System.out.println("Dog is sleeping");
        }
	    
	    public static void main (String[]args) {
	    	
	    	Dog dog1= new Dog(); // creating objects from the class dog  
	    	
	    	dog1.bark(); // calling a behavoir on an object 
	    	
	    	dog1.sleep(); 
	    }
        
        
	}


