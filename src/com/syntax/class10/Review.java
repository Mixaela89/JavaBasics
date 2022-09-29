package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

          Scanner scanner =new Scanner (System.in) ;
          
          System.out.println("how many dresses ");
          int size=scanner.nextInt(); //number of dresses
          double [] prices=new double [size]; 
          
          for (int i=0; i<size; i++) {
        	  System.out.println("pls enter the price of dress numnber"+i);
        	  prices[i]=scanner.nextDouble(); 
          }
          
          
          System.out.println(Arrays.toString(prices));
          
          double sum=0; 
          for (double price:prices) {
        	  sum+=price;
          }
          
          System.out.println("total for all the dresses"+ sum);
          
          
          
         
	}

}
