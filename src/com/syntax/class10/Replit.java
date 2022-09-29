package com.syntax.class10;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] years = new int[11];
	    
      for (int i=0; i< years.length; i++) {
   
          years[i]+=(i+2010); 
      System.out.println(years[i]);}
       
         
	
	// years[i]+= (i+2010);     
        
        
      //  Scanner scanner=new Scanner(System.in);
        
       // int [] arr= new int[5]; 
        
       // for(int i=0; i<=4; i++){
       //   arr[i] =scanner.nextInt(); 
 
      //   }
   //
     //   for (int j=4; j>=0; j--) {
      //      System.out.print(arr[j]+" ");
    
      //  }
        
 
	
    int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4, 6, 5 , 6}
		};
		 int sum=0;
		 for (int i=0; i<a.length; i++) {
			 for (int j=0; j<a[i].length; j++ ) {
				 if(i%2==0&&j%2==0) {
					 sum+=a[i][j]; 
				 } 
			 }
			 
		 }       
            System.out.println(a.length);
            System.out.println(a[0].length);
            
	System.out.println(sum);
}
	
}	

	
 
	
		
		

	


