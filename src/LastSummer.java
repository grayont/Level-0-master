import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		String summer = JOptionPane.showInputDialog("What did you do last summer?");
		JOptionPane.showMessageDialog(null, "Hello, " + name + ". I know you did this last summer: " + summer);
	}

}
