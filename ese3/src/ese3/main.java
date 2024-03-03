package ese3;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		//ese3
		
		String input=JOptionPane.showInputDialog("Enter your name");
		
		 char[] ch = input.toCharArray();
		 ch[0] = input.charAt(input.length()-1);
		 ch[input.length()-1] = input.charAt(0);
		 String out = String.valueOf(ch);
		 System.out.println(out);
		 
		
		 
	}

}
