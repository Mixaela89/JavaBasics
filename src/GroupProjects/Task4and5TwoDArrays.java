package GroupProjects;

public class Task4and5TwoDArrays {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store
          odd and even numbers. Develop a program which will identify/print the even numbers only. 
		 */

            int[][] array= {
            		{3, 5, 2, 0, -6}, 
            		{2, 7, 13,6}
            };
		int sum=0;
		for(int[]row:array) {
			for(int num:row) {
				if(num%2==0) {
					//sum=sum+num; for task 5 to calculate summary
					System.out.println(num);
		      }
				
			}		
		}
		
		//System.out.println(sum);for task 5 to calculate summary
		
	}

}
