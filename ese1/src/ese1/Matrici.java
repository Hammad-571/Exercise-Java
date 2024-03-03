package ese1;

public class Matrici 
{
	private int row;
	private int col;
	private int [][] arr;
	public Matrici(int r,int c, int [][] ar) 
	{
		row = r;
		col = c;
		arr = new int [row][col];
		arr = ar;
	}
	
	int getValue(int r, int c) 
	{
		return arr[r][c];
	}
	
	/**int[][] getArray()
	{
		return this.arr;
	}
	*/
	int getRow() 
	{
		return row;
	}
	
	int getCol() 
	{
		return col;
	}
	
	int[][] multiSca(int s)
	{
		int [][]finalArray = new int [this.getRow()][this.getCol()];
		for(int i = 0; i < this.getRow(); i++) 
		{
			for(int t=0; t < this.getCol(); t++) 
			{
				finalArray[i][t] = this.getValue(i, t)*s;
			}
		}
		return finalArray;
	}
	int [][] multi(Matrici m)
	{
		int n = this.getRow();
		int c = m.getCol();
		int [][]finalArray = new int [n][c];
		
		for (int i=0;i<n;i++) 
		{
			for(int j=0;j<c;j++) 
			{
				finalArray[i][j]=0;
    			for(int k=0;k<this.getCol();k++)
    			{
    				finalArray[i][j]=finalArray[i][j]+this.getValue(i, k) * m.getValue(k, j);
        		} 
			}	
		}
		return finalArray;
	}
	int[][] somma(Matrici m)
	{
		int r,c;
		
		if(this.getRow() > m.getRow() ) 
		{
			r = this.getRow();
		}else 
		{
			r = m.getRow();
		}
		
		if(this.getCol() > m.getCol() ) 
		{
			c = this.getCol();
		}else 
		{
			c = m.getCol();
		}
		int [][]finalArray = new int [r][c];
		for(int i = 0; i < r; i++) 
		{
			for(int t=0; t < c; t++) 
			{
				if(this.getRow() <= i || this.getCol() <=t )
				{
					finalArray[i][t] = m.getValue(i, t); 
				}
				else if(m.getRow() <= i || m.getCol() <= t)
				{
					finalArray[i][t] = this.getValue(i, t); 
				}
				else
				{
					finalArray[i][t] = this.getValue(i, t) + m.getValue(i, t); 
					System.out.print(finalArray[i][t]);
				}
				System.out.print("\n");
			}
		}
		return finalArray;
	}
}
