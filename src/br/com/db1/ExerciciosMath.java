package br.com.db1;

public class ExerciciosMath {

	private Double valor1;
	private Double valor2;
	private Double valor3;
	private Double resultado;

	public Double exibirResultado() {
		return resultado;
	}

	public Double menorNumero(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			return valor1;
		} else {
			return valor2;
		}
	}

	public Double menorNumero3(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2 && valor1 < valor3) {
			return valor1;
		} else if (valor2 < valor3 && valor2 < valor1) {
			return valor2;
		} else {
			return valor3;
		}
	}
	
	
}
