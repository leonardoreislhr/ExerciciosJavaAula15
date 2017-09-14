package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somaTest() {
		exerciciosInteger.soma(2d, 3d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 5d);
	}

	@Test
	public void subtrairTest() {
		exerciciosInteger.subtrair(7d, 6d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 1d);
	}

	@Test
	public void multiplicarTest() {
		exerciciosInteger.multiplicar(4d, 7d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 28d);
	}

	@Test
	public void dividirTest() {
		exerciciosInteger.dividir(21d, 7d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 3d);
	}

	@Test
	public void numeroParTest() {
		exerciciosInteger.numeroPar(10d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 0);
	}

	@Test
	public void maiorNumeroTest() {
		exerciciosInteger.maiorNumero(5d, 10d);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 10d);
	}

	@Test
	public void imparesNumeroAte100() {
		Integer[] numerosImpares = exerciciosInteger.imparesNumeroAte100(97);
		Assert.assertTrue(numerosImpares[0] == 97);
		Assert.assertTrue(numerosImpares[1] == 99);
	}
}
