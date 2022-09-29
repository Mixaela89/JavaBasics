package com.syntax.class10;

public class TwoDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {
				{10, 20, 30, 40 },//1st array 
				{100, 200, 300, 400},// 2nd array
				{1, 2, 3, 4}, // 3rd array
				
		}; 
		System.out.println(arr[0][1]); //access 20
		
		
        // mr miss array
		
		String[][] bigArray=new String [2][4];
		bigArray[0][0]="Mr"; //first row
		bigArray[0][1]="Mrs";
		bigArray[0][2]="Ms";
		bigArray[0][3]="Miss";
		bigArray[1][0]="Smith"; //2nd row
		bigArray[1][1]="Jordan";
		bigArray[1][2]="Jackson";
		bigArray[1][3]="Obama";
		
		System.out.println(bigArray[0][3]+bigArray[1][0]);
		
		
		// names and grades  print student with  grade
		
		
		String [][] students= {
				{"Kenny", "John", "May", "Anna"},
				{"a","b", "c","d"}, 
		};
		
		System.out.println(students[0][3]+ "has grade "+ students[1][2]);
	} 

}
