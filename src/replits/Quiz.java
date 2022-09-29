package replits;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
	  //  int z = 0;
	    // for (int y = 0; y >= z; y++) {
	        // System.out.print(y + "~");
	       //  System.out.println(z);
	    // }

		int count = 0;
		while (count++ < 10) {
		System.out.println("Welcome to Java");
		}
		
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
		System.out.println(y);


		int k=3, tot=0;

		do{

		   tot=tot+k;

		   k++;

		} while(k<11);

		System.out.print(tot);
		
		int x=1;

		do{

		   x++;

		   System.out.print(x);

		}while(x<5);
		
		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
		
		 for(int i = 0; i <= 5; i++ )
	        {
	            System.out.println("i = " + i );
	        }
	}

}
