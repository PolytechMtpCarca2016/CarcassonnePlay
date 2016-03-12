package historical;

import static org.junit.Assert.*;

import org.junit.Test;

public class histTest {

	@Test
	public void testGetTitle() {
		BrutHistoricalInfo h = new BrutHistoricalInfo("eglise");
		assertEquals("le titre devrait etre eglise","eglise",h.getTitle());
	}

	@Test
	public void testGetInfoText() {
		BrutHistoricalInfo hi = new BrutHistoricalInfo("rempart");
		assertEquals("l'info devrait etre canard","canard",hi.getInfoText());
	}

	@Test
	public void testBrutHistoricalInfo() {
		BrutHistoricalInfo his = new BrutHistoricalInfo("chateau");
		assertSame(BrutHistoricalInfo.class,his.getClass());
		assertEquals("le titre doit etre chateau","chateau",his.getTitle());
		assertEquals("l'info doit etre coq","coq",his.getInfoText());
		assertSame(String.class,his.getTitle().getClass());
		assertSame(String.class,his.getInfoText().getClass());
		
	}

}
