package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Input");
		List<String> li = new ArrayList<String>();
		li.add(str);
		str = JOptionPane.showInputDialog("Input");
		li.add(str);
		str = JOptionPane.showInputDialog("Input");
		li.add(str);
		str = JOptionPane.showInputDialog("Input");
		li.add(str);
		
		Collections.sort(li);
		
		for(String s : li)
		{
			System.out.println(s);
		}
	}

}
