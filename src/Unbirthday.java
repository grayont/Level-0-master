import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("What's your birthday? Format it as \"m/d\"");
		
		
		if (bday.contains("1/29")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday!");
		}
	}

}
