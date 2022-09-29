package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		// values being stored in arrayes are called elements 
           int[] arr=new int[4];
           
           arr[0]=10; 
           arr[1]=20;
           arr[2]=30;
           arr[3]=40; 
           
           //accessing elements from array 
           System.out.println(arr[2]+arr[1]);
           
           //array to store classmates
           
           String[] names=new String[5]; 
            names [0]="Shah";
            names [1]="Vera";
            names [2]="Roman";
            names [3]="Guljan";
            names [4]="Zaman";
           System.out.println("Hello "+names[1]); 
           
           int[] nums=new int[3]; 
           nums[1]= 12;
           nums[2]= 13;
           
           String[] colors=new String[3]; 
           colors[0]="white";
           colors[1]="pink";
           colors[2]="black";
           colors[3]="yellow"; //compilier wont complain, but when u run then error index out of bound
           
           
           
           
	}


}
