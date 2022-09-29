package com.syntax.class11;

public class DogHomework {

		   String color;
		   String breed;
		   int age;
		   
		   String name;
		
	void bark() {
		System.out.println("woof woof");
	}

	void eat() {
		System.out.println("nom nom ");
	}
	
	public static void main (String []args) {
		
		DogHomework husky= new DogHomework (); 
		husky.name="Leo"; 
		husky.breed="husky";
		husky.age=3; 
		
		husky.eat();
		
		DogHomework bulldog= new DogHomework (); 
		bulldog.name="Tom"; 
		bulldog.breed="bulldog";
		bulldog.age=5; 
		
		bulldog.bark();
		
		
		DogHomework labrador= new DogHomework (); 
		labrador.name="Lab"; 
		labrador.breed="labrador";
		labrador.age=1; 
		
		labrador.bark();
		
	}
	
}
