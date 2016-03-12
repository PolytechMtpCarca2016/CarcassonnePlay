package minigame;

import static org.junit.Assert.*;

import org.junit.Test;

import historical.BrutHistoricalInfo;

public class TestEnigma {

	@Test
	public void testGetQuestion() {
		BrutEnigma cha = new BrutEnigma("chateau");
		assertEquals("ce n'est pas ça","qui etait duchesse?",cha.getQuestion());
	}

	@Test
	public void testGetAnswer() {
		BrutEnigma d = new BrutEnigma("donjon");
		assertEquals("ce n'est pas ça","personne",d.getAnswer());
	}

	@Test
	public void testBrutEnigma() {
		BrutEnigma his = new BrutEnigma("chateau");
		assertSame(BrutEnigma.class,his.getClass());
		assertEquals("quelle duchesse","qui etait duchesse?",his.getQuestion());
		assertEquals("la dame carcasss","dame Carcas",his.getAnswer());
		assertSame(String.class,his.getQuestion().getClass());
		assertSame(String.class,his.getAnswer().getClass());
	}

}
