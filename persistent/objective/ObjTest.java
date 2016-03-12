package objective;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjTest {

	@Test
	public void testIsOver() {
		BrutObjective obj = new BrutObjective("demoObjective");
		assertEquals("pas �a",false,obj.isOver());
	}

	@Test
	public void testGetPlace() {
		BrutObjective obj = new BrutObjective("demoObjective");
		Place p = new Place("baba",25,65);
		assertEquals("pas �a",p.getTitle(),obj.getPlace().getTitle());
		assertTrue("pas �a",p.getLatitude()==obj.getPlace().getLatitude());
		assertTrue("pas �a",p.getLongitude()==obj.getPlace().getLongitude());
	}

	@Test
	public void testGetTitle() {
		BrutObjective obj = new BrutObjective("demoObjective");
		assertEquals("pas �a","demoObjective",obj.getTitle());
	}

	@Test
	public void testGetTheme() {
		BrutObjective obj = new BrutObjective("demoObjective");
		assertEquals("pas �a","bou",obj.getTheme());
	}

	@Test
	public void testGetPlaceLatitude() {
		BrutObjective obj = new BrutObjective("demoObjective");
		assertTrue("pas �a",(25==obj.getPlaceLatitude()));
	}

	@Test
	public void testGetPlaceLongitude() {
		BrutObjective obj = new BrutObjective("demoObjective");
		assertTrue("pas �a",(65==obj.getPlaceLongitude()));
	}
	@Test
	public void testSetTitle() {
		BrutObjective obj = new BrutObjective("demoObjective");
		obj.setTitle("bi");
		assertEquals("pas �a","bi",obj.getTitle());
	}

	@Test
	public void testSetPlace() {
		BrutObjective obj = new BrutObjective("demoObjective");
		Place n = new Place("nou",45,89);
		obj.setPlace(n);
		assertEquals("pas �a",n,obj.getPlace());
	}

	@Test
	public void testSetTheme() {
		BrutObjective obj = new BrutObjective("demoObjective");
		obj.setTheme("bla");
		assertEquals("pas �a","bla",obj.getTheme());
	}

	@Test
	public void testSetCompleted() {
		BrutObjective obj = new BrutObjective("demoObjective");
		obj.setCompleted();
		assertEquals("pas �a",true,obj.completed);
	}

	@Test
	public void testBrutObjective() {
		BrutObjective obj = new BrutObjective("demoObjective");
		assertSame(BrutObjective.class,obj.getClass());
	}

}
