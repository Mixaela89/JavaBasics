package com.syntax.class10;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] bigArray=new int [3][4]; 
		bigArray[0][0]=10; //first row
		bigArray[0][1]=20;
		bigArray[0][2]=30;
		bigArray[0][3]=40;
		
		bigArray[1][0]=100; //2nd row 
		bigArray[1][1]=200; //2nd row 
		bigArray[1][2]=300; //2nd row 
		bigArray[1][3]=400; //2nd row 
		
		bigArray[2][0]=1; //3nd row 
		bigArray[2][1]=2; //3nd row 
		bigArray[2][2]=3; //3nd row 
		bigArray[2][3]=4; //3nd row 
		
		System.out.println(bigArray[1][2]); //to print 300
	}

}
