package com.qa.app;

public class Refractor extends Location implements Move {

	@Override
	public void move(String dir) {

		int currxCoord = getxCoord();
		int curryCoord = getyCoord();

		switch (dir) {

		case "North":
			setyCoord(curryCoord + 1);
			break;

		case "South":
			setyCoord(curryCoord - 1);
			break;

		case "East":
			setxCoord(currxCoord + 1);
			break;

		case "West":
			setxCoord(currxCoord - 1);
			break;
		}

	}

}
