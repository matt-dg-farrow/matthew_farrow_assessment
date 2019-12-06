package com.qa.app;

public class Walker {

	private double distToTreasure;
	public PlayerLocation playLoc = new PlayerLocation();
	public TreasureLocation tresLoc = new TreasureLocation();

	public double distanceCalc() {
		double xDist = playLoc.getxCoord() - tresLoc.getxCoord();
		double yDist = playLoc.getyCoord() - tresLoc.getyCoord();
		return distToTreasure = Math.hypot(xDist, yDist);

	}

	public void move(String dir) {
		int currxCoord = playLoc.getxCoord();
		int curryCoord = playLoc.getyCoord();

		switch (dir) {

		case "North":
			playLoc.setyCoord(curryCoord + 1);
			break;

		case "South":
			playLoc.setyCoord(curryCoord - 1);
			break;

		case "East":
			playLoc.setxCoord(currxCoord + 1);
			break;

		case "West":
			playLoc.setxCoord(currxCoord - 1);
			break;
		}

	}
}

//	public void move(String dir) {
//		int currxCoord = playLoc.getxCoord();
//		int curryCoord = playLoc.getyCoord();
//		if (dir == "North") {
//			playLoc.setxCoord(curryCoord + 1);
//		}
//		if (dir == "South") {
//			playLoc.setxCoord(curryCoord + 1);
//		}
//	}
//}
