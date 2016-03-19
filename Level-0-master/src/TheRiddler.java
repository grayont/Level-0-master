import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String answer = JOptionPane.showInputDialog("Poor people have it. Rich people need it. You die if you eat it. What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.equalsIgnoreCase("Nothing")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
			
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}

		// 6. Add some more riddles
		String answertwo = JOptionPane.showInputDialog("What occurs once in a minute, twice in a moment and never in one thousand years?");
		
		if (answertwo.equalsIgnoreCase("The letter M")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		
		JOptionPane.showMessageDialog(null, "The score is " + score);
		
		if (score == 0) {
			JOptionPane.showMessageDialog(null, "Lol, you got zero.");
			
		}
		
		else {
						JOptionPane.showMessageDialog(null, "Nice job!");
		}
			

		// 2. Make a pop up to show the score.
	
		
	}
}
