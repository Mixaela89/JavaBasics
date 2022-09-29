package com.syntax.class09;

public class Homework {

	public static void main(String[] args) {
		//task 1 cars
		
		String [] car={"bmw","toyota","jeep", "tesla" }; 
		
		for (int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
		
		for (String print:car) {System.out.println(print);}
		
		// task 2 animals
		
		String [] animals= {"bear", "snake","cat", "horse","fly"};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		for(String ani:animals) {
			System.out.println(ani);}
		
		

	}

}
