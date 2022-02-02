package es.iessoterohernandez.daw.endes.TestEj4;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSubcriscion extends CoreMatchers{
	private static Subscripcion s;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new Subscripcion(80, 8);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		s=null;
	}

	

	@Test
	void testSubscripcion() {
		assertThat("Construtor mal realizado", s, notNullValue());
	}

	@Test
	void testPrecioPorMes() {
		double precio=-1;
		precio=Math.round(s.precioPorMes());
		double esperado=10;
		
		assertThat("El precioPorMes no va", precio, is(esperado));
	}

	@Test
	void testCancel() {
		s.cancel();
		double esperado=0;
		assertThat("El metodo cancela subcricion no funciona", s.precioPorMes(), is(esperado));
	}

}
