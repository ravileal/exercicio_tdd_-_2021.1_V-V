package br.ufc.quixada.es.vev.exercicio.tdd.teste;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

import br.ufc.quixada.es.vev.exercicio.tdd.model.Calculadora;

public class TesteCalculadora {

	@Test
	public void testaSomaDeDoisInteiros() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(1, 2);
		Assert.assertEquals(resultado, 3);
	}

	@Test
	public void testaSubstraiDoisInteiros() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrair(5, 2);
		Assert.assertEquals(resultado, 3);
	}

	@Test
	public void testeSubutrairInteirosERetornarNumeroNegativo() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrair(1, 2);
		Assert.assertEquals(resultado, -1);
	}

	@Test
	public void testaMultiplicaDeDoisInteiros() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplicar(1, 2);
		Assert.assertEquals(resultado, 2);
	}

	@Test
	public void testaMultiplicaDeDoisDoubles() {
		Calculadora calculadora = new Calculadora();
		double resultado = calculadora.multiplicar(5.5, 1.2);
		Assert.assertEquals(resultado, 5.5*1.2, 0.01);
	}

	@Test
	public void testaDivideDeDoisInteiros() {
		Calculadora calculadora = new Calculadora();
		float resultado = calculadora.dividir(1, 2);
		Assert.assertEquals(0.5, resultado, 0.01);
	}

	@Test
	public void testaDividePorZero() {
		try {
			Calculadora calculadora = new Calculadora();
			calculadora.dividir(1, 0);
			fail();
		} catch (ArithmeticException e) {
			Assert.assertEquals("/ by zero", e.getMessage());
		}
	}

	@Test
	public void testeDividePorZero0() {
		try {
			Calculadora calculadora = new Calculadora();
			calculadora.dividir(1, 0);
			fail();
		} catch (ArithmeticException e) {
			assertTrue(e.getMessage().contains("/ by zero"));
		}
	}
	
	@Test
	public void testeDividePorZero1() {
		Calculadora calculadora = new Calculadora();

		ThrowingRunnable runnable = new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				calculadora.dividir(1, 0);
			}
		};

		ArithmeticException thrown = Assert.assertThrows(ArithmeticException.class, runnable);

		assertTrue(thrown.getMessage().contains("/ by zero"));
	}
	
	@Test
	public void testeDividePorZero2() {
		Calculadora calculadora = new Calculadora();

		ThrowingRunnable runnable = () -> calculadora.dividir(1, 0);

		ArithmeticException thrown = Assert.assertThrows(ArithmeticException.class, runnable);

		assertTrue(thrown.getMessage().contains("/ by zero"));
	}
	
	@Test
	public void testeDividePorZero3() {
		Calculadora calculadora = new Calculadora();

		ArithmeticException thrown = Assert.assertThrows(ArithmeticException.class, () -> calculadora.dividir(1, 0));

		assertTrue(thrown.getMessage().contains("/ by zero"));
	}
	
	
	@Test
	public void testeDividePorZero4() {
		assertTrue(Assert
				.assertThrows(
						ArithmeticException.class, 
						() -> new Calculadora().dividir(1, 0))
				.getMessage()
				.contains("/ by zero"));
	}
	
}
