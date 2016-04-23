import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in this recipe. 2. ask students how they
 * might use the method to make the picture in the laminated hand-outs.
 */

public class StarShow {

	Robot SwagLord = new Robot("batman");

	void makeStars() {

		// 5. delete this line. you will draw the star again in step 8.
		// 13. Set the speed to 8
		SwagLord.setSpeed(10);

		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int X = 10;

		// 7. Make a variable to hold the Y position of the Robot and set it to 950
		int Y = 950;

		// 8. Make a variable to hold the star size and set it to 25
		int starsize = 25;

		// 12. Repeat the steps #19 to #18, 30 times
		for (int i = 0; i < 30; i++) {

			// 19. Set the pen width to i
			SwagLord.setPenWidth(i);

			// 10. Set the X position of the robot to your X variable
			SwagLord.setX(X);

			// 11. Set the Y position of the robot to your Y variable
			SwagLord.setY(Y);

			// 9. Call the drawStar() method with your star size variable
			drawStar(starsize);

			// 14. Increase the X position by star size. See Figure 2.
			X = X + starsize;

			// 15. decrease the Y position by star size. See Figure 3.
			Y = Y - starsize;

			// 16. Increase the star size by 20
			starsize = starsize + 20;

			// 17. Turn the robot 12 degrees
			SwagLord.turn(12);

			// 18. Make each star a different random color like in Figure 4.
			SwagLord.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		SwagLord.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show

		// 1. Move the robot the distance of the starSize variable
		for (int i = 0; i < 5; i++) {

			SwagLord.move(starSize);

			// 3. Turn the robot 144 degrees
			SwagLord.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
