package GroupProjects;

public class Task3TwoDArraySum {

	public static void main(String[] args) {
		// create 2d array , print sum of all numbers
		
		int[][] array={
			{1,2,5},
			{1,3,0,-10},
			{2, 3, 6, 7}
		};
        int sum=0; 
		for(int[] row:array) {
			for(int number:row) {sum=sum+number;}	
			
		}
		System.out.println(sum);
	}

}
