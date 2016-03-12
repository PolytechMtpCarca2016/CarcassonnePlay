package item;

import static org.junit.Assert.*;

import org.junit.Test;

public class indexTestItem {

	@Test
	public void testGetItem() {
		IndexOfItem i = new IndexOfItem();
		assertEquals("l'item devrait etre chevalier","chevalier",i.getItem("castle"));
		IndexOfItem ind = new IndexOfItem();
		assertEquals("l'item devrait etre prisonnier","prisonnier",ind.getItem("donjon"));
	}

}
