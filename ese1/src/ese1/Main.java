package ese1;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {{2, 3,-1}, 
				       {6, 1,-2}};
		int[][] arr1 = {{4, -5}, 
				        {-3, 0},
				        {1, 2}};
		Matrici m1 = new Matrici(2,3,arr);
		Matrici m2 = new Matrici(3,2,arr1);
		//System.out.print(m1.getValue(1, 0));
		/*int [][] somma = m1.somma(m2);
		for(int i = 0; i < 2; i++) 
		{
			for(int t=0; t < 3; t++) 
			{
				System.out.print(somma[i][t]);
			}
			
		}
		int [][] multi = m1.multi(m2);
		for(int i = 0; i < 2; i++) 
		{
			for(int t=0; t < 2; t++) 
			{
				System.out.print(multi[i][t]+" ");
			}
			System.out.print("\n");
		}
		*/
	}

}
