package quest;

import static org.junit.Assert.*;

import org.junit.Test;


public class QuestTest {

	@Test
	public void testGetName() {
		BrutQuest q = new BrutQuest("la dame carcas");
		assertEquals("ça doit etre la dame carcas","la dame carcas",q.getName());
	}

	@Test
	public void testGetStory() {
		BrutQuest qe = new BrutQuest("demoQuest");
		assertEquals("ça doit etre sauver ryan","sauver le soldat Ryan",qe.getStory());
	}

	@Test
	public void testIsStarted() {
		BrutQuest quest = new BrutQuest("la dame carcas");
		assertEquals("elle na pas commencé",false,quest.isStarted());
	}

	@Test
	public void testIsCompleted() {
		BrutQuest ques = new BrutQuest("demoQuest");
		assertEquals("elle nest pas finie",false,ques.isCompleted());
	}

	@Test
	public void testGetIllustrations() {
		BrutQuest quet = new BrutQuest("la dame carcas");
		assertEquals("ce n'est pas celle là","photo2",quet.getIllustrations().get(0));
	}

	@Test
	public void testBrutQuest() {
		BrutQuest his = new BrutQuest("demoQuest");
		assertSame(BrutQuest.class,his.getClass());
	}

}
