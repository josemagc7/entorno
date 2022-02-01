package es.iessoterohernandez.daw.endes.PruebasUni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PruebaProductoJunit5 {
	private static Product p;
	private static Product p2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p=new Product ("Melocotones", 8.26);
		 p2=new Product ("Piña", 1.36);
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
	void testEqualsObject() {
		assertTrue(p.equals(p2));
	}

}
