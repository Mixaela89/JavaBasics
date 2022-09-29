package com.syntax.class09;

public class Tasks {

	public static void main(String[] args) {
		// task 1 grades
	 char[] grade=new char[6];
		grade[0]='a'; 
		grade[1]='b';
		grade[2]='c';
		grade[3]='d';
		grade[4]='e';
		grade[5]='f';
	System.out.println(grade[1]);	
		
	char[] grades= {'a','b','c','d','e','f'}; 
        System.out.println(grades[1]);
        
        
        //task 2 store names from students. print your own name
        
        String[] name=new String[3]; 
        name[0]="Jason";
        name[1]="Anna";
        name[2]="Mihaela"; 
        System.out.println(name[2]);
        
        String[] names= {"jason", "anna", "mihaela"}; 
        System.out.println(names[2]);
        
        // create array of words to print a sentence 
        
        String[] words= {"Java","Saturday","day","coding","is"};
        System.out.println(words[1]+" "+ words[4]+" " +words[0]+" "+words[3]+" "+words[2] );
	}

}
