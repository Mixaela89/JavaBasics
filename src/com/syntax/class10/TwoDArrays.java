package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [][] countries= {
        		{"usa", "canada"},	//first array 00, 01
        		{"Peru", "Brazil","Colombia", "Ecuador"},  // 2nd 
        		{"Ethiopia", "Egypt", "Kenya"}, 
        		{"Germany", "Turkiye", "Moldovia", "Ukraine"}, 
        		{"Kazakshstan", "Afhganistan", "Korea"},   		
        };
		
		System.out.println(countries.length); // 5 number of arrays/rows 
		
		 int elementOf1Array = countries[0].length;
	        System.out.println("# of elements frome 1 Array: "+elementOf1Array);

	        int elementOf2Array = countries[1].length;
	        System.out.println("# of elements frome 2 Array: "+elementOf2Array);
	        System.out.println();

	        System.out.println("--> Getting all values for 2D Arrays <--");
	        System.out.println();


	        for(int row=0; row<countries.length; row++) {
	            System.out.println();
	            for(int col =0; col<countries[row].length; col++) {

	                System.out.print(countries[row][col]+" ");

	            }

	            System.out.println();

	        }
	}

}
