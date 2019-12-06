package com.qa.app;

public class Walker {

	private double distToTreasure;
	private double distToPlayer;
	public PlayerLocation playLoc = new PlayerLocation();
	public TreasureLocation tresLoc = new TreasureLocation();
	public ChaserLocation oppLoc = new ChaserLocation();

	public double distanceCalc() {
		double xDist = playLoc.getxCoord() - tresLoc.getxCoord();
		double yDist = playLoc.getyCoord() - tresLoc.getyCoord();
		return distToTreasure = Math.hypot(xDist, yDist);

	}

	public double distToPlayerCalc() {
		double xDist = (playLoc.getxCoord() - oppLoc.getxCoord());
		double yDist = (playLoc.getyCoord() - oppLoc.getyCoord());
		if (xDist > yDist) {
			return xDist;
		} else {
			return yDist;
		}
	}

	public void playerMove(String dir) {
		playLoc.move(dir);
	}

	public void opponentMove(String dir) {
		oppLoc.move(dir);
	}

}
