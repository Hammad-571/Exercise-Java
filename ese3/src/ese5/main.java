package ese5;

import javax.swing.JOptionPane;

import ese4.UniqueListArray;

public class main {

	public static void main(String[] args) {
		
		//String in=JOptionPane.showInputDialog("Enter your password");
		String in = "1H13a4571";
		Password p1 = new Password(in);
		 String out ="1h13a4571";
		if(p1.isEquals(out))
		{
			System.out.println("Log in");
		}
		else
		{
			System.out.println("Wrong password");
		}
		 
	}

}
