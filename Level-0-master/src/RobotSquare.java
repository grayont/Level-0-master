import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot Swaglord = new Robot();

		// 3. Put the robot's pen down
		Swaglord.penDown();

		// 6. Make the tortoise move as fast as possible
		Swaglord.setSpeed(1000);

		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			
		

		// 		2. Move your robot 200 pixels
		Swaglord.move(200);

		// 		4. Turn the robot 90 degrees to the right (90 degrees)
		Swaglord.turn(90);
		}

	}
}
