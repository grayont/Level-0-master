import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {

		String ans1 = JOptionPane.showInputDialog("Enter a number.");
		String ans2 = JOptionPane.showInputDialog("Enter another number.");
		String ans3 = JOptionPane.showInputDialog("Enter one more number.");

		int num1 = Integer.parseInt(ans1);
		int num2 = Integer.parseInt(ans2);
		int num3 = Integer.parseInt(ans3);
		int tempnum;
		for (int i = 0; i < 2; i++) {
			if (num1 > num2) {
				tempnum = num1;
				num1 = num2;
				num2 = tempnum;

			}
			if (num2 > num3) {
				tempnum = num2;
				num2 = num3;
				num3 = tempnum;
			}

		}
		JOptionPane.showMessageDialog(null, num1 + " " + num2 + " " + num3);

	}
}
