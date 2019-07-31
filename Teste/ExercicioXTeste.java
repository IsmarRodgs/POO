package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExercicioXTeste extends ExercicioX {

	ExercicioX x;
	
	@Before
	public void setUp() throws Exception {
		x = new ExercicioX();
	}

	@Test
	public void testSoma() {
		assertEquals(500500, x.soma());
	}
	
	@Test
	public void testSomaTermos() {
		assertEquals(500500, x.somaTermos(1, 1000, 1000));
	}
	
	@Test
	public void testSomarTodos() {
		assertEquals(500500, x.somarTodos(1, 1000));
	}
	
	@Test
	public void testcalcularMultiplo() {
		assertTrue("é multiplo", x.calcularMultiplo(12));
	}
}