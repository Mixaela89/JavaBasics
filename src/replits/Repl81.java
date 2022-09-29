package replits;

public class Repl81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int [][] arr= {
				  {2, 3, 0},
				  {4, 44, 5, -2},
		  }; 
		  
		  int largest=arr[0][0]; 
		  for (int [] row:arr) {
			  for (int n:row) 
				  if (n>largest) {
					  largest=n;
				  }
			  }
		  
		System.out.println(largest);
	

}}