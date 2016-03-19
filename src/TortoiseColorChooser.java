// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		int angle = 0;
	
		Tortoise Swaglord = new Tortoise();
		//3. ask the user what color they would like the tortoise to draw
		for (int x = 0; x < 4; x++) {
			
		
		
		String answer = JOptionPane.showInputDialog("What color should the tortoise draw?");
		String shape = JOptionPane.showInputDialog("What shape should it be?");
		
		//4. use an if/else statement to set the pen color that the user requested
		if (answer.equalsIgnoreCase("green")) {
			Swaglord.setPenColor(Color.green);
			
		}
		
		else if (answer.equalsIgnoreCase("Blue")) {
			Swaglord.setPenColor(Color.blue);
			
		}
		
		else if (answer.equalsIgnoreCase("red")) {
			Swaglord.setPenColor(Color.red);
			
		}
		
		else if (answer.equalsIgnoreCase("yellow")) {
			Swaglord.setPenColor(Color.yellow);
		}
		
		else if (answer.equalsIgnoreCase("orange")) {
			Swaglord.setPenColor(Color.orange);
		}

//5. if the user doesn’t enter anything, choose a random color
		else if (answer.equals("")) {
		
		Swaglord.setPenColor(PenColors.getRandomColor());
		}

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		if (shape.equalsIgnoreCase("Square")) {
		angle = angle + 90;	
		}
		
		else if (shape.equalsIgnoreCase("Pentagon")) {
			angle = angle + 360/5;
		}
		
		else if (shape.equalsIgnoreCase("Triangle")) {
		angle = angle + 120;
		}
		
		else if (shape.equalsIgnoreCase("hexagon")) {
		angle = angle + 60;
		}
		
		
		//2. set the pen width to 10
		Swaglord.setPenWidth(10);		
		
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
	
		for (int i = 0; i < 4; i++) {
			
		
		Swaglord.move(200);
		Swaglord.turn(angle);
		
		}

		}
	}
}


