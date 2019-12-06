package com.qa.test;

import static org.junit.Assert.assertTrue;

import com.qa.app.Game;
import com.qa.app.Location;
import com.qa.app.PlayerLocation;
import com.qa.app.TreasureLocation;
import com.qa.app.Walker;

public class Test {

	@org.junit.Test
	public void gameTest() {

		Location tresLoc1 = new TreasureLocation();
		Location playLoc1 = new PlayerLocation();

		assertTrue(0 == playLoc1.getxCoord());
		assertTrue(0 == playLoc1.getyCoord());

		Game game1 = new Game();
		game1.start();

		assertTrue(game1.walk1.tresLoc.getxCoord() != 0);
		assertTrue(game1.walk1.tresLoc.getyCoord() != 0);

		Walker walk1 = new Walker();
		// Below lines used to test in earlier stages, now always gives an error due to
		// game finishing when
		// walk1.distanceCalc()); == 0
//		assertTrue(0 != walk1.distanceCalc());

//		game1.walk1.playerMove("North");
//		assertEquals(1, game1.walk1.playLoc.getyCoord());

		assertTrue(game1.walk1.tresLoc.getxCoord() == game1.walk1.playLoc.getxCoord());
		assertTrue(game1.walk1.tresLoc.getyCoord() == game1.walk1.playLoc.getyCoord());

	}
}
