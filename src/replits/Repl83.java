package replits;

public class Repl83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int sumRow=0;
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length;j++) {
				sumRow+=a[i][j]; 
				
			}
			System.out.println(sumRow);
			sumRow=0;
			
		}

		
		
	}

}
