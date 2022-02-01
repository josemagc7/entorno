package es.iessoterohernandez.daw.endes.PruebasUni;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaProductoJunit4 {
	private static Product p;
	private static Product p2;
	@BeforeClass
	 public void init() {
		p=new Product ("Melocotones", 8.26);
		p2=new Product ("Piña", 1.36);
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
	public void testEqualsObject() {
		Assert.assertTrue(p.equals(p2));
	}

}
