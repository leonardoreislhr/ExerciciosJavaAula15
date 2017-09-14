package br.com.db1;

public class ExerciciosInteger {

	private Double resultado;
	private Double valor1;
	private Double valor2;

	public Double exibirResultado() {
		return resultado;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public void soma(Double valor1, Double valor2) {
		resultado = valor1 + valor2;
	}

	public void subtrair(Double valor1, Double valor2) {
		resultado = valor1 - valor2;
	}

	public void multiplicar(Double valor1, Double valor2) {
		resultado = valor1 * valor2;
	}

	public void dividir(Double valor1, Double valor2) {
		resultado = valor1 / valor2;
	}

	public void numeroPar(Double valor1) {
		resultado = valor1 % 2;
	}

	public void maiorNumero(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			resultado = valor2;
		} else {
			resultado = valor1;
		}
	}

	public Integer[] imparesNumeroAte100(Integer valor1) {
		Integer contador = 0;
		Integer[] impares = new Integer[50];
		for (Integer x = valor1; x < 100; x++) {
			if (x % 2 != 0) {
				System.out.println(x);
				impares[contador] = x;
				contador++;
			}
		}
		return impares;
	}

}
