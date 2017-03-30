import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFibonacci10() {
		int resultado = Fibonacci.compute(10);
		int esperado = 55;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFibonacci12() {
		int resultado = Fibonacci.compute(12);
		int esperado = 144;
		assertEquals(esperado,resultado);
	}
	
	
}
