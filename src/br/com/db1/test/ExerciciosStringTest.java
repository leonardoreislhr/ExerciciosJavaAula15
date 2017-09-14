package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	private ExerciciosString exerciciosString = new ExerciciosString();

	@Test
	public void letraMaiusculaTest() {
		String texto = exerciciosString.letraMaiuscula("texto");
		Assert.assertEquals("TEXTO", (texto));
		Assert.assertTrue("TEXTO".equals(texto));
	}

	@Test
	public void letraMinusculaTest() {
		String texto = exerciciosString.letraMinuscula("texto");
		Assert.assertEquals("texto", (texto));
		Assert.assertTrue("texto".equals(texto));
	}

	@Test
	public void contagemTest() {
		Integer numero = exerciciosString.contagem("DB1START");
		Integer numero2 = exerciciosString.contagem(" DB1START ");
		Assert.assertTrue(8 == numero);
		Assert.assertTrue(10 == numero2);
	}

	@Test
	public void contagemSemEspacoTest() {
		Integer numero = exerciciosString.contagemSemEspacos(" DB1START ");
		Assert.assertTrue(8 == numero);
	}

	@Test
	public void quatroPrimeirasLetrasTest() {
		String texto = exerciciosString.quatroPrimeirasLetras("LEONARDO HENRIQUE DOS REIS");
		Assert.assertEquals("LEON", texto);
	}

	@Test
	public void partirTerceiraLetraTest() {
		String texto = exerciciosString.partirTerceiraLetra("LEONARDO");
		Assert.assertEquals("NARDO", texto);
	}

	@Test
	public void ultimasQuatroLetrasTest() {
		String texto = exerciciosString.ultimasQuatroLetras("LEONARDO");
		Assert.assertEquals("ARDO", texto);
	}

	@Test
	public void substituirTest() {
		String texto1 = exerciciosString.substituir("LEONARDO HENRIQUE DOS REIS");
		Assert.assertEquals("ALUNO HENRIQUE DOS REIS", texto1);
	}

	@Test
	public void partesFraseTest() {
		String partesFrase[] = exerciciosString.partesFrase("banana;maçã;melancia");
		Assert.assertEquals("banana", partesFrase[0]);
		Assert.assertEquals("maçã", partesFrase[1]);
		Assert.assertEquals("melancia", partesFrase[2]);
	}

	@Test
	public void contarVogaisTest() {
		Integer numero = exerciciosString.contarVogais("leonardo");
		Assert.assertTrue(4 == numero);
	}
	
	/*@Test
	public void inverterTextoTest(){
		String palavra = exerciciosString.
	}*/
}
