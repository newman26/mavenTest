package tp.mavenTest;

import static org.junit.Assert.assertEquals;




import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {
	protected Addition op = new Addition();
	
	@BeforeClass
	public static void setUpC() throws Exception {
		
		System.out.println("beforeClass");
	}
	
	
	@Before
	public void setUp() throws Exception {
	
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}
	
	@AfterClass
	public static void tearDownC() throws Exception {
		System.out.println("afterClass");
	}
	@Test
	public void testCalculer() throws Exception {
		assertEquals(new Long(4), op.calculer(new Long(3), new Long(1)));
		System.out.println("testCalculer");
	}

	@Test
	public void testLireSymbole() throws Exception {
		assertEquals((Character) '-', op.lireSymbole());
		System.out.println("testLireSymbole");
	}


}
