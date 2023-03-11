package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calculadoraSimplesTest {

	public calculadoraSimples calc = new calculadoraSimples();

	@Test
	public void testeSoma() {

		int somar = (int) calc.somar(2, 2);
		assertEquals(4, somar);
	}

	@Test
	public void testeSubtrair() {

		int subtrair = (int) calc.subtrair(2, 2);
		assertEquals(0, subtrair);

	}

	@Test
	public void testeDividir() {

		int dividir = (int) calc.dividir(2, 2);
		assertEquals(1, dividir);
	}

	@Test
	public void testemultiplicar() {

		int multiplicar = (int) calc.multiplicar(2, 2);
		assertEquals(4, multiplicar);
	}
}
