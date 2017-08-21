import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
public static void main(String[] args) {
	Random jeff=new Random();
	int jack=jeff.nextInt(7);
	int jim=jeff.nextInt(7);
	int jose=jeff.nextInt(7);
	int joe=jeff.nextInt(7);
	int mynameisjack=jeff.nextInt(7);
	int mynameisjose=jeff.nextInt(7);
	int mynameisjeff=jeff.nextInt(7);
	JOptionPane.showMessageDialog(null, "Your number is "+jack+jim+jose+joe+mynameisjack+mynameisjose+mynameisjeff);
}
}
