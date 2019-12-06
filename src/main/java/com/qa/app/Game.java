package com.qa.app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Game {
	public Walker walk1 = new Walker();
	DecimalFormat df = new DecimalFormat("#.##");

	public void start() {
		System.out.println(
				"You find yourself in a swamp... \nYou feel inside your pocket and find a magic compass. \nIt seems to point you in the direction of treasure! \n");
		walk1.tresLoc.startPosition();

		Scanner scan = new Scanner(System.in);
		while (walk1.distanceCalc() != 0) {
			System.out.println("The compass indicates that the treasure is " + df.format(walk1.distanceCalc())
					+ "m away from you.");
			while (true) {
				String input = scan.nextLine();
				String dir;

				if (input.startsWith("N") || input.startsWith("n")) {
					dir = "North";
					walk1.move(dir);
					break;
				} else if (input.startsWith("S") || input.startsWith("s")) {
					dir = "South";
					walk1.move(dir);
					break;
				} else if (input.startsWith("E") || input.startsWith("e")) {
					dir = "East";
					walk1.move(dir);
					break;
				} else if (input.startsWith("W") || input.startsWith("w")) {
					dir = "West";
					walk1.move(dir);
					break;
				} else {
					System.out.println("You can only move North, East, South or West. Try again.");
				}

			}

		}
		System.out.println("Congratulations, you found the treasure!");
		scan.close();

	}

}
