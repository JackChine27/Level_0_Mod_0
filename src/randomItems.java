import java.util.Random;

import javax.swing.JOptionPane;

//Create a program that asks the user for three items and selects one at random.
public class randomItems {
	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("Type in an item");
		String y = JOptionPane.showInputDialog("Type in another item");
		String z = JOptionPane.showInputDialog("Type in another item");
		Random xyz = new Random();
		int xyzxyz = xyz.nextInt(3);
		if (xyzxyz == 0) {
			JOptionPane.showMessageDialog(null, x);
		}
		if (xyzxyz == 1) {
			JOptionPane.showMessageDialog(null, y);
		}
		if (xyzxyz == 2) {
			JOptionPane.showMessageDialog(null, z);
		}
	}

	
}