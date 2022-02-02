package es.iessoterohernandez.daw.endes.TestEj4;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBoa extends CoreMatchers {
	private	static Boa b;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 b = new Boa("boita", 10, "granola bars");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		b=null;
	}

	@Test
	void testBoa() {
		
		assertThat("no funciona el constructor", b,notNullValue() );
	}

	@Test
	void testIsHealthy() {
		
		assertThat("El metodo isHealthy no funciona", b.isHealthy(), is(true));
	}

	@Test
	void testFitsInCage() {
		assertThat("El metodo no funciona", b.fitsInCage(12), is(true));
	}

}
