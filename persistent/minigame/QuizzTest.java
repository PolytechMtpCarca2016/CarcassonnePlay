package minigame;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuizzTest {

	@Test
	public void testGetQuestion() {
		BrutQuizz c = new BrutQuizz("castle");
		assertEquals("ce n'est pas ça","combien de duchesse?",c.getQuestion());
	}

	@Test
	public void testGetPossibility() {
		BrutQuizz d = new BrutQuizz("donjon");
		assertEquals("ce n'est pas ça","une",d.getPossibility(0));
	}

	@Test
	public void testGetNumberOfPossibilities() {
		BrutQuizz ca = new BrutQuizz("castle");
		assertEquals("ce n'est pas ça",1,ca.getNumberOfPossibilities());
	}

	@Test
	public void testGetAnswer() {
		BrutQuizz don = new BrutQuizz("donjon");
		assertEquals("ce n'est pas ça",0,don.getAnswer());
	}

	@Test
	public void testBrutQuizz() {
		BrutQuizz don = new BrutQuizz("donjon");
		assertSame(BrutQuizz.class,don.getClass());
		assertSame(String.class,don.getQuestion().getClass());
		assertSame(String.class,don.getPossibility(0).getClass());
	}

}
