package com.syntax.class10;

public class MoreTwoDArray {

	public static void main(String[] args) {
		// outer loop iterates rows and inner is for col 
		String[][] arr= {
                {"Yusuf","Hamza","Adam","John"},
                {"A","B","C","D"}
        };
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                System.out.print( arr[i][j]);
            }
        }
        
        System.out.println();
		// enhanced 
        
        for(String[] singleArray:arr) { //loops over 1d or single array

            for(String el:singleArray) { //loops over each element of the 1dArray
                System.out.print(el+"  ");
            }
            }
            System.out.println();
		
	}

	String[][] countries = {

            { "Usa", "Canada" }, // 1 array with index 0
            { "Peru", "Brazil", "Colombia", "Ecuador" }, // 2 array with index 1
            { "Ethiopia", "Egypt", "Kenya" }, { "Germany", "Turkiye", "Moldova", "Ukraine" },
            { "Kazakhstan", "Afghanistan", "Korea" } };

  //* 
	// System.out.println(" ------- getting all values from 2d array using for each loop -----");

  //  for (String[] country : countries) {

     //   for (String c : country) {
//
        //    if (c.equals("Kazakhstan")) {
          //      System.out.println(c+ " is my home country");
         //   } else {
          //      System.out.print(c + "  ");
         //   }
      //  }
     //   System.out.println();
 
        
}
