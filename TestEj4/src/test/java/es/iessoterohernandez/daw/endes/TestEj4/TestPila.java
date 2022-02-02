package es.iessoterohernandez.daw.endes.TestEj4;

import static org.junit.Assert.assertThat;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

class TestPila extends CoreMatchers{

	

	@Test
	void testPush() {
		Pila p=new Pila();
		p.push(1);
		assertThat("El metodono funciona", p.top(), nullValue());
	}

	@Test
	void testPop() {
		Pila p = new Pila();
		p.push(15);
		assertThat("La pila esta vacia", p.isEmpty(), is(false));
		assertThat("el metodo push no funciona", p.pop(),is(15));
	}

	@Test
	void testIsEmpty() {
		Pila p = new Pila();
		p.push(15);
		assertThat("El metodo empty no funciona", p.isEmpty(), is(false));
	}

	@Test
	void testTop() {
		Pila p=new Pila();
		p.push(15); /*este metodo se queda con el valor mas bajo que tenga la pila mientra que no sea menor o igual que 2*/
		p.push(10);
		
		assertThat("Error el metodo top() no funciona", p.top(), is(10));
	}

}
