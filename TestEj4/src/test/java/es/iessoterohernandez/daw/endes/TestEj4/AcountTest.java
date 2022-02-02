package es.iessoterohernandez.daw.endes.TestEj4;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

class AcountTest extends CoreMatchers{
	private static Account cuenta;
	
	private String duenio;
	private long numCuenta;
	private float dinero;

static Stream<Arguments> cuentas() {
		
		return Stream.of(
				Arguments.of("Pedro",2,80,8),
				Arguments.of("Julian",5,120),
				Arguments.of("hugo",1,800)
				);
		}

	@Test
	void testAccount(String duenio, long numCuenta, float dinero) {
		
		long numCu=0;
		if(numCuenta==2) {
			numCu=numCuenta;
		}if(numCuenta==5) {
			numCu=numCuenta;
		}if(numCuenta==1) {
			numCu=numCuenta;
		}
			
			
			
			
		assertThat("el metodo no funciona",cuenta.getAccountNumber(), is(numCu));
		
	}

	@Test
	void testDeposit() {
		fail("Not yet implemented");
	}

	@Test
	void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	void testAddInterest() {
		fail("Not yet implemented");
	}

}
