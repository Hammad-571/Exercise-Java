package ese2;
import javax.swing.*;
public class main {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("Enter your name");
		System.out.println(input.toUpperCase());
		System.out.println("the 1st char is "+ input.charAt(0)+ " the last char is "+ input.charAt(input.length()-1));
	}

}
