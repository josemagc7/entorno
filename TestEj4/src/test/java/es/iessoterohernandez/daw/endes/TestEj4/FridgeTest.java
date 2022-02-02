package es.iessoterohernandez.daw.endes.TestEj4;

import static org.junit.Assert.assertThat;
import java.util.stream.Stream;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized.Parameters;

class FridgeTest extends CoreMatchers{
	private static Fridge f;
	
	@BeforeAll
	static void init() {
		f = new Fridge();
	}

	@AfterAll
	static void finis() {
		f = null;
	}

	@Parameters
	static Stream<Arguments> meterNevera() {
		
		return Stream.of(

				Arguments.of("Lechuga"), Arguments.of("pepino"), Arguments.of("melocoton"));
	}

	@ParameterizedTest
	@MethodSource("meterNevera")
	void testPut(String hay) {
		f.put(hay);
		f.put(null);
		boolean meter;
		if (f.contains(hay)) {
			meter = true;
		} else {
			meter = false;
		}

		assertThat("el metodo put no funciona", f.contains(hay), equalTo(meter));
	}

	@ParameterizedTest
	@MethodSource("meterNevera")
	void testContains(String hay) {

		f.put(hay);

		boolean meter;
		if (f.contains(hay)) {
			meter = true;
		} else {
			meter = false;
		}

		assertThat("El metodo contains no funciona", f.contains(hay), equalTo(meter));
	}

	@ParameterizedTest
	@MethodSource("meterNevera")
	void testTake(String hay) throws NoSuchItemException {
		
		f.take(hay);

		assertThat("el metodo contains no funciona", f.contains(hay), is(false));
	}

}
