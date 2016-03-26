import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		
	
	
	  //Ask the user how many hours they spent coding this week.
	int hours = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
	  
	   //If it's 3 or more, tell them they're a Code Ninja.
	if (hours >= 3) {
		JOptionPane.showMessageDialog(null, "You are a code ninja!");
	}
	  
	   //If it's less than 2, tell them to stop watching YouTube and write code instead.
	else if (hours < 2) {
		JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead.");
	}
	else if (hours > 5) {
		playBatmanTheme();
	}
	}
		
	
	   //If it's more than 5, play the Batman theme song.
	 

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	}


