package item;

import static org.junit.Assert.*;

import org.junit.Test;

import historical.BrutHistoricalInfo;

public class TestItem {

	@Test
	public void testGetName() {
		BrutItem b= new BrutItem("chevalier");
		assertEquals("le nom devrait etre chevalier","chevalier",b.getName());
	}

	@Test
	public void testGetTexture() {
		BrutItem p= new BrutItem("prisonnier");
		assertEquals("l'info devrait etre mauvais","mauvais",p.getTexture());
	}

	@Test
	public void testBrutItem() {
		BrutItem his = new BrutItem("chevalier");
		assertSame(BrutItem.class,his.getClass());
		assertEquals("le nom doit etre chevalier","chevalier",his.getName());
		assertEquals("l'info doit etre adoube","adoube",his.getTexture());
		assertSame(String.class,his.getName().getClass());
		assertSame(String.class,his.getTexture().getClass());
	}

}
