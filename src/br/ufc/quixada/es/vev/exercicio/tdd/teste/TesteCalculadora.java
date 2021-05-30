package br.ufc.quixada.es.vev.exercicio.tdd.teste;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
			assertThat(e.getMessage(), is("/ by zero"));
		}
	}

}
