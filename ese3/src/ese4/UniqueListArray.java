package ese4;

public class UniqueListArray {

	private int arraySize ;
	private Object[] array ;
	private int in;
	
	public UniqueListArray(int s , Object ch)
	{
		
		arraySize = s;
		array = new Object[arraySize];
		
		int r =0;
		for(int i = 0; i < ch.toString().length();i++)
		{
			String strIn = array.toString();
			if(!strIn.contains(ch.toString()))
			{
				array[i-r] = ch.toString().charAt(i);
			}
			else
			{
				r++;
			}
		}
		in = ch.toString().length()-r;
		
		
	}

	void add(Object c) 
	{
		if(in < arraySize)
		{
			String str = array.toString();
			String find = String.valueOf(c);
			if(!str.contains(find))
			{
				array[in] = c;
				in++;
			}
		}
		else
		{
			System.out.print("Can't");
		}
		System.out.print(array.toString());
		
		
	}
}
