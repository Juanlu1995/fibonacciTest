import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class FibonacciTestParameterized {

	private int resultadoEsperado, valorEntrada;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][]{
			{0,0},{1,1},{1,2},{2,3},{3,4},{5,5},{8,6},{13,7}
		});
	}
	
	public FibonacciTestParameterized(int resultadoEsperado, int valorEntrada){
		this.resultadoEsperado = resultadoEsperado;
		this.valorEntrada = valorEntrada;
	}	
	
	@Test
	public void testFib() {
		assertEquals(resultadoEsperado, Fibonacci.compute(valorEntrada));
	}
}
