package es.iessoterohernandez.daw.endes.TestEj4;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOperadorAritmetico extends CoreMatchers {
	@BeforeAll
	static void init(){
		new OperadorAritmetico();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testSuma() {
		assertThat("no funciona el metodo", OperadorAritmetico.suma(6, 6), is(12));
	}

	@Test
	void testDivision() throws Exception {
		assertThat("no funciona el metodo", OperadorAritmetico.division(25, 5), is(5));
	}

}
