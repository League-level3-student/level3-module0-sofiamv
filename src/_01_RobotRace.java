package _00_IntroToArrays;

//package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	int bah = 0;

	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robos = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robos.length; i++) {
			robos[i] = new Robot();
			robos[i].setY(550);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		robos[0].setX(0);
		robos[1].setX(90);
		robos[2].setX(180);
		robos[3].setX(270);
		robos[4].setX(360);
		// robos[5].setX(450);
		// robos[6].setX(540);
		// robos[7].setX(630);
		// robos[8].setX(720);
		// robos[9].setX(810);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random a = new Random();
		for (int i = 0; i < robos.length; i++) {
			robos[i].move(a.nextInt(100));
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean isRacing = true;
		while (isRacing) {
			for (int i = 0; i < robos.length; i++) {
				int aa = i++;
				robos[i].move(a.nextInt(100));
				if (robos[i].getY() <= 100) {
					isRacing = false;
					robos[i].turn(360);
					JOptionPane.showMessageDialog(null, "Robot " + aa + " is the winner!");
				}
			}
		}
	}

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
