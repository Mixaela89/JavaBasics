package com.syntax.class11;

public class Student {  // class is like blueprint/design general 

	
		// TODO Auto-generated method stub
           String name; 
           String id;
           int age;
           double weight; 
           char gender; 
	
   void study() {
	   System.out.println("student is studying");
   }
   void deleteMessages() {
	   System.out.println("student is deleting messages from discord");
   }
   
   void eat() {
	   System.out.println("eating pizzzaa ");
   }
   
   public static void main (String []args) {
	   Student FraidonObject= new Student(); 
	   // new Student() creates the object of Student Class 
	   //Student FraidonOBject is assiging variable 
	    
	      FraidonObject.name="Fraidon";
	      FraidonObject.id="123";
	      FraidonObject.age=22;
	      System.out.println(FraidonObject.name);
	      System.out.println(FraidonObject.age);
	      FraidonObject.deleteMessages();
	      
	      System.out.println("******************");
	      Student student2=new Student(); 
	      student2.name="Asma";
	      student2.age=16;
	      student2.weight=30; 
	      student2.gender='F'; 
	      
	      student2.eat();
	      
	      
   }
   
   
}
