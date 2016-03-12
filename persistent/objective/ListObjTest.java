package objective;
import quest.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ListObjTest {

	@Test
	public void testGetListObjective() {
		Quest q = new BrutQuest("demoQuest");
		ListObjective l = new ListObjective(q);
		assertEquals("pas ça",l.tabObjectives,l.getListObjective());
	}
	
	@Test
	public void testAddObjective() {
		Quest q = new BrutQuest("demoQuest");
		ListObjective l = new ListObjective(q);
		Objective obj = new BrutObjective("bibi");
		l.addObjective(obj);
		assertEquals("pas ça",obj,l.getListObjective().get(5));
	}
	
	@Test
	public void testListObjective() {
		Quest q = new BrutQuest("demoQuest");
		ListObjective l = new ListObjective(q);
		assertSame(ListObjective.class,l.getClass());
	}
}
