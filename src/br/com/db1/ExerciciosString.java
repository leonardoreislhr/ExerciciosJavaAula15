package br.com.db1;

public class ExerciciosString {
	
	public String resposta;
	public String texto;
	
	public String exibirResposta(){
		return resposta;
	}
	
	public String letraMaiuscula(String texto){
		return texto.toUpperCase();
	}
	
	public String letraMinuscula(String texto){
		return texto.toLowerCase();
	}
	
	public Integer contagem(String texto){
		return texto.length();
	}
	
	public Integer contagemSemEspacos(String texto){
		return texto.trim().length();
	}
	
	public String quatroPrimeirasLetras(String texto){
		return texto.substring(0, 4);
	}
	
	public String partirTerceiraLetra(String texto){
		return texto.substring(3);
	}
	
	public String ultimasQuatroLetras(String texto){
		return texto.substring(4, 8);
	}
	
	public String substituir(String texto1){
		String[]primeiroNome = texto1.split(" ");
		return texto1.replace(primeiroNome[0], "ALUNO");
	}
	
	public String[] partesFrase(String texto){
		String[]partesFrase = texto.split(";");
		return partesFrase;
		}
	
	public Integer contarVogais(String texto){
		texto = texto.toLowerCase();
		Integer contarVogais = 0;
		for (Integer x = 0; x < texto.length(); x++) {
			String letra = texto.substring(x, x+1);
			if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
				contarVogais++;
		}
		return contarVogais;
		}
	
	public String inverterTexto(String texto){
		String palavra = new StringBuffer(texto).reverse().toString();
		return palavra; 
	}
}
