import javax.swing.JOptionPane;

public class Awesome {
	public static void main(String[] args) {
	String awesome	= JOptionPane.showInputDialog(null, "What do you think is awesome?");
	JOptionPane.showMessageDialog(null, awesome + " is awesome!");
	}

}
