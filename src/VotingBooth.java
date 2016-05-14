import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String vote = JOptionPane.showInputDialog("Who do you vote for?");
		
		if(vote.equalsIgnoreCase("Donald Trump")){
			JOptionPane.showMessageDialog(null, "Ayy lmao. Nice m3m3.");
		}
		else{
			String ageS = JOptionPane.showInputDialog("How old are you?");
			int age = Integer.parseInt(ageS);
		
		if(age > 17){
			JOptionPane.showMessageDialog(null, vote + " will be the next president");
		}
		
		else if(age < 18){
			JOptionPane.showMessageDialog(null, "You're not allowed to vote.");
		}
		}
		
		
	}

}
