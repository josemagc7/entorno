/**
 * 
 */
package es.iessoterohernandez.daw.endes.PruebasUni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author josem
 *
 */
class PruebaPersonaJunit5 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	static Persona p;
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	 p=new Persona("victor",85,'H',52.0,168.0);
			
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.PruebasUni.Persona#calcularIMC()}.
	 */
	@Test
	void testCalcularIMC() {
		assertEquals(p.calcularIMC(),1);
	}

	/**
	 * Test method for {@link es.iessoterohernandez.daw.endes.PruebasUni.Persona#esMayorDeEdad()}.
	 */
	@Test
	void testEsMayorDeEdad() {
		assertTrue(p.esMayorDeEdad());
	}

}
