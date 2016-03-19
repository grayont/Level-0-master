
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter and print
 * their boarding pass. You need to collect the following information: First name Last name Destination airport Birthday
 * (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY, M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("First Name");
		String last = JOptionPane.showInputDialog("Last Name");
		String destination = JOptionPane.showInputDialog("Where are you flying today?");
		String bday = JOptionPane.showInputDialog("Date of Birth");
		String sex = JOptionPane.showInputDialog("Sex");

		JOptionPane.showMessageDialog(null,
				last.toUpperCase() + " / " + first.toUpperCase() + " (" + bday + ", " + sex + ")" + "\n" + "Traveling to: " + destination.toUpperCase());

	}
}
