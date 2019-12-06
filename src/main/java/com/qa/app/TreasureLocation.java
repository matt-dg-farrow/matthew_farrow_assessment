package com.qa.app;

import java.util.Random;

public class TreasureLocation extends Location {

//	public double distanceCalc() {
//		double xDist = xCoordPlayer - xCoordTreasure;
//		double yDist = yCoordPlayer - yCoordTreasure;
//		return distance = Math.hypot(xDist, yDist);
//
//	}

	public void startPosition() {
		Random rand = new Random();
		while (getxCoord() == 0 || getyCoord() == 0) {
			setxCoord(rand.nextInt(20) - 10);
			setyCoord(rand.nextInt(20) - 10);
		}

	}
}
