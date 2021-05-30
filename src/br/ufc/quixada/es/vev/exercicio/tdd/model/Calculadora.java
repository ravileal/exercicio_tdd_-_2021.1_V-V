package br.ufc.quixada.es.vev.exercicio.tdd.model;

public class Calculadora {

	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public float dividir(float a, float b) throws ArithmeticException{
		float result = a / b;
		if (result == Float.POSITIVE_INFINITY)
			throw new ArithmeticException("/ by zero");
		return result;
	}
	
}
