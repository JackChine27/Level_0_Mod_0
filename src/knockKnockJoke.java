import javax.swing.JOptionPane;

//Make a program that tells a knock-knock joke it the proper order.
//modify it so it receives the responses from the user.
public class knockKnockJoke {
	public static void main(String[] args) {
		String whosThere=JOptionPane.showInputDialog("Knock knock");
		if(whosThere.equals("Who's there")) {
			String who=JOptionPane.showInputDialog("A broken pencil");
			if(who.equals("A broken pencil who")) {
				JOptionPane.showMessageDialog(null, "Nevermind, it's pointless");
			}
		}
		
	}
}


