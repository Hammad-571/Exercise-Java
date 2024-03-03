package ese4;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ese4
		 String in=JOptionPane.showInputDialog("Enter your name");
		 
		 for(int i = in.length(); i >0 ; i--)
		 {
			 System.out.print(in.charAt(i -1)); 
		 }
		 char[] ch = in.toCharArray();
		 Object obj = in;
		 String strSize=JOptionPane.showInputDialog("Enter your name");
		 int size = Integer.parseInt(strSize);
		 UniqueListArray list = new UniqueListArray(size, obj);
		 char c = 'E';
		 list.add(c);
		/* c = 'E';
		 list.add(c);*/
	}

}
