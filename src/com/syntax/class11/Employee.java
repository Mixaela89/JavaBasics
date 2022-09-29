package com.syntax.class11;

public class Employee {
	
	String name;
	String id;
	String department; 
	double salary; 
	String shift; 
	
	void work() {
		System.out.println(name+ "is working on shift"+shift);
	}
	
	void takeLeaves() {
		System.out.println(name+ "going on leave");
	}
	 public static void main (String []args) {
		 Employee emp1=new Employee(); 
		 emp1.name="john";
		 emp1.id="123";
		 emp1.department="IT";
		 emp1.salary=200000;
		 emp1.shift="evening";
		 emp1.work(); 
		 
		 Employee emp2=new Employee(); 
		 emp2.name="adam";
		 emp2.id="123";
		 emp2.department="sales";
		 emp2.salary=15000;
		 emp2.shift="morning";
		 emp2.work(); 
		 
	 }
	

}
