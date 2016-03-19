import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
				for (int i = 1; i < 9; i++) {
					
					if (i == 4) {
						JOptionPane.showMessageDialog(null, "4");
					}
					
					else if (i == 8) {
						JOptionPane.showMessageDialog(null, "More");
						
					}
					
					else {
						JOptionPane.showMessageDialog(null, i + " potato");
					}
			
			
		}
				
	}

}
