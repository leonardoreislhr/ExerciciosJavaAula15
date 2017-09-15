package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosMath;

public class ExerciciosMathTest {
	
	private ExerciciosMath exerciciosMath = new ExerciciosMath();
	
	@Test
	public void menorNumeroTest() {
		Double resultado = exerciciosMath.menorNumero(2d, 5d);
		Assert.assertTrue(resultado == 2d);
	}

	@Test
	public void menorNumero3() {
		Double resultado = exerciciosMath.menorNumero3(3d, 5d, 7d);
		Assert.assertTrue(resultado == 3d);
	}
}
