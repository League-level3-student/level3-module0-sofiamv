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
		robos[0].setX(90);
		Thread rei = new Thread(() -> RobosRacing(robos[0], 1));
		robos[1].setX(180);
		Thread ichi = new Thread(() -> RobosRacing(robos[1], 1));
		robos[2].setX(270);
		Thread ni = new Thread(() -> RobosRacing(robos[2], 1));
		robos[3].setX(360);
		Thread san = new Thread(() -> RobosRacing(robos[3], 1));
		robos[4].setX(450);
		Thread yon = new Thread(() -> RobosRacing(robos[4], 200));
		rei.start();
		ichi.start();
		ni.start();
		san.start();
		yon.start();
		//san.start();
		//yon.start();
		// robos[5].setX(450);
		// robos[6].setX(540);
		// robos[7].setX(630);
		// robos[8].setX(720);
		// robos[9].setX(810);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
	}
		//Random a = new Random();
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		public static void RobosRacing(Robot j, int h) {
		boolean isRacing = true;
		Random a = new Random();
		while(isRacing) {
				j.move(h);
				if (j.getY() == 100) {
					isRacing = false;
					j.turn(360);
					JOptionPane.showMessageDialog(null, "Robot " + j + " is the winner!");
				}
			}
		}
	}

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

