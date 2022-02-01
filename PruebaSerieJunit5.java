package es.iessoterohernandez.daw.endes.PruebasUni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaSerieJunit5 {
	private static Serie s;
	private static Serie s2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s=new Serie("La casa de papel", 5, "Accion", "Mi abuelo");
		 s2=new Serie("La casa de piedra", 7, "construcion", "Mi padre");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsEntregado() {
		assertTrue(s.isEntregado());
	}

	@Test
	void testCompareTo() {
		assertEquals(1,s.compareTo(s2));
	}
	@Test
	public void testEqualsSerie() {
		assertTrue(s.equals(s2));
	}

}
