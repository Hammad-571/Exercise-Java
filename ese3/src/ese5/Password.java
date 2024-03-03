package ese5;

public class Password {
	
	private String pass;
	public Password(String str)
	{
		if(isValid(str))
		{
			pass = str;
		}
		else
		{
			System.out.println("Please re enter the password");
		}
		
	}
	
	boolean isEquals(String str) 
	{
		if(pass.equals(str))
		{
			return true;
		}
		return false;
	}
	
	private boolean isValid(String str)
	{
		int num = 0;
		boolean up = false; 
		if(str.length()>7)
		{
			for(int i= 0; i < str.length(); i++) 
			{
				char ch = str.charAt(i);
				if(Character.isDigit(ch))
				{
					num++;
				}
				else if(Character.isAlphabetic(ch))
				{
					if(Character.isUpperCase(ch))
					{
						up = true;
					}
				}
				else
				{
					return false;
				}
			}
		}
		else
		{
			return false ;
		}
		if(num > 1 && up == true) 
		{
			return true;
		}
		return false;
	}
}
