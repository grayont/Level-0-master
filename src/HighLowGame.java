import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		int number = new Random().nextInt(100);
		for (int i = 0; i < 7; i++) {

			String answer = JOptionPane.showInputDialog("I'm thinking of a number between 1 and 100. What is it?");
			int answer2 = Integer.parseInt(answer);
			if (answer2 == number) {
				JOptionPane.showMessageDialog(null, "Wow! You won! :D");
			} else if (answer2 > number) {
				JOptionPane.showMessageDialog(null, "Oh no! You guessed too high ;~;");
			} else if (answer2 < number) {
				JOptionPane.showMessageDialog(null, "Uh oh! You guessed too low. :(");
			}
		}

	}

}
