package historical;

import static org.junit.Assert.*;

import org.junit.Test;

public class histIndexTest {

	@Test
	public void testGetInfoTitle() {
		IndexOfHistoricalInfos i = new IndexOfHistoricalInfos();
		assertEquals("le titre de l'info doit etre chateau","chateau",i.getInfoTitle("castle"));
		IndexOfHistoricalInfos ind = new IndexOfHistoricalInfos();
		assertEquals("le titre de l'info doit etre assaut","assaut",ind.getInfoTitle("donjon"));
	}

}
