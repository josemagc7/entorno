package es.iessoterohernandez.daw.endes.PruebasUni;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaPersonaJunit4 {
	static Persona p;
	@BeforeClass
	public static void init() {
	 p=new Persona("victor",85,'H',52.0,168.0);
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
	public void testCalcularIMC() {
		
		Assert.assertEquals(p.calcularIMC(),1);
		//yo pienso que tendria uqe dar 1 pero da -1 porque el codigo esta malamente y siempre entra en infrapeso
	}

	@Test
	public void testEsMayorDeEdad() {
		Assert.assertTrue(p.esMayorDeEdad());
		//al tener 85 años supinia que daba verdadero
	}

}
