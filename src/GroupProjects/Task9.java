package GroupProjects;

public class Task9 {

	public static void main(String[] args) {
		//TASK 9 Maximum and minimum number in the array? meaning largest and smallest?! 

            int[] num= {-1,200,200, -8, 30,55,88,400};
            int max=num[0];// initializing max&min to start from first element- index[0]
            int   min=num[0]; 
            for (int n:num) {  //creating for loop to go over all elements in the array
            	if(n>max) {max=n;}   
            	if (n<min) {min=n;}
            }; 
            
            System.out.println("the max number in this array is"+max);
            System.out.println("the min number in this array is"+ min);
   
            // 2d array additional example
            
            int[][] numbers= {
            		{1, 2, 50, 3},
            		{2, 5, 0, 50, 97}, 
            };   
            int largest=numbers [0][0];  //initializing largest and smallest to start from 1st element
            int smallest=numbers[0][0];
            for (int[] row:numbers) {        //outer loop to go over the rows 
            	for (int element:row) {       // inner loop to go over the elements in each row    
            		if(element>largest) {
            			largest=element;}
            		if(element<smallest) {
            			smallest=element;
            		}}}
            		
               System.out.println("largest number in the 2d array is " +largest);
            System.out.println("smallest number in the 2d array is "+smallest);
                  
            
            }        
	}


