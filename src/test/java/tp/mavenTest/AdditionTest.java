package tp.mavenTest;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	protected Addition op;

	@Before
	public void setUp() throws Exception {
		op = new Addition();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculer() throws Exception {
		assertEquals(new Long(4), op.calculer(new Long(3), new Long(1)));
	}

	@Test
	public void testLireSymbole() throws Exception {
		assertEquals((Character) '+', op.lireSymbole());
	}


}
