package minigame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIndexGame {

	@Test
	public void testGetMiniGameType() {
		IndexOfMiniGame i = new IndexOfMiniGame();
		assertEquals("ca doit etre quizz","quizz",i.getMiniGameType("castle"));
	}

	@Test
	public void testGetMiniGame() {
		IndexOfMiniGame ind = new IndexOfMiniGame();
		assertEquals("ca doit etre prison","prison",ind.getMiniGame("donjon"));
	}

}
