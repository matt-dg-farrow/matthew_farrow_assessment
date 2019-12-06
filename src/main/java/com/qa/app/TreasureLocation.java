package com.qa.app;

import java.util.Random;

public class TreasureLocation extends Location {

	public void startPosition() {
		Random rand = new Random();
		while (getxCoord() == 0 || getyCoord() == 0) {
			setxCoord(rand.nextInt(30) - 15);
			setyCoord(rand.nextInt(30) - 15);
		}

	}
}
