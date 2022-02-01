package es.iessoterohernandez.daw.endes.PruebasUni;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaSerieJunit4 {

	private static Serie s;
	private static Serie s2;
 @BeforeClass
 public void init() {
	 s=new Serie("La casa de papel", 5, "Accion", "Mi abuelo");
	 s2=new Serie("La casa de piedra", 7, "construcion", "Mi padre");
 }

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEntregado() {
		Assert.assertTrue(s.isEntregado());
	}

	@Test
	public void testCompareTo() {
		Assert.assertEquals(1,s.compareTo(s2));
	}

	@Test
	public void testEqualsSerie() {
		Assert.assertTrue(s.equals(s2));
	}

}
