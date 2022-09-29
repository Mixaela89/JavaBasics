package GroupProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After
		//the array is created, calculate the sum of all stored elements in that array.
		
		//Scanner scan=new Scanner (System.in);
		
		///int num=scan.nextInt();
		//System.out.println("pls enter a bunch of numbers");
		//int[] numbers= new int[num];
		//System.out.println(numbers[3]);
		//for(int n:numbers) {
		//	num=scan.nextInt();
	
		
	/*Scanner sc = new Scanner(System.in);
    int size;
    System.out.println("Enter the number of size of array");
    size = sc.nextInt();
    int[] a = new int[size];
    System.out.println("Enter the array element");
    //For reading the element
    for(int i=0;i<size;i++) {
        a[i] = sc.nextInt();
    }
    //For print the array element
    for(int i : a) {
        System.out.print(i+" ,");
    }
	 * 
	 */
		
          Scanner scanner=new Scanner (System.in); 
          
          System.out.println("pls enter the size of the array");
          int size =scanner.nextInt();

          int[] arr=new int[size]; 
          
          for (int i=0; i<size; i++) {
        	  System.out.println("pls enter number");
        	  arr[i]=scanner.nextInt();
          }
          System.out.println(Arrays.toString(arr)); //print all 
			  int sum=0;
	          for(int num:arr) {
	        	  sum+=num;
	          }
	          System.out.println("sum of all the numbers from the array is"+ sum);
}
}
