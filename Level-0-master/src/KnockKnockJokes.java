import java.util.Random;

import javax.swing.JOptionPane;

public class KnockKnockJokes {
	public static void main(String[] args) {
		String answer = null;
		int num = new Random().nextInt(3);
		if (num == 0) {
			JOptionPane.showInputDialog("Knock knock.");
			answer = JOptionPane.showInputDialog("A herd.");
		}

		else if (num == 1) {
			JOptionPane.showInputDialog("Knock knock.");
			answer = JOptionPane.showInputDialog("Noah.");

		} else if (num == 2) {
			JOptionPane.showInputDialog("Knock knock.");
			answer = JOptionPane.showInputDialog("Sadie.");
		}

		if (answer.equalsIgnoreCase("A herd who?")) {
			JOptionPane.showMessageDialog(null, "A herd you were home, so I came over to Netflix and chill.");
		}

		else if (answer.equalsIgnoreCase("Noah who?")) {
			JOptionPane.showMessageDialog(null, "Noah good place we can Netflix and chill?");
		}

		else if (answer.equalsIgnoreCase("Sadie who?")) {
			JOptionPane.showMessageDialog(null, "Sadie magic word and we can Netflix and chill.");

		}
	}
}
