package ese4;

public class ListArray extends UniqueListArray{

	private int arraySize ;
	private char[] array ;
	public ListArray(int s, char[] arr) 
	{
		super(s, arr);
		// TODO Auto-generated constructor stub
		arraySize = s;
		for(int i = 0; i < arr.length;i++)
		{
			array[i] = arr[i];
		}
	}

}
