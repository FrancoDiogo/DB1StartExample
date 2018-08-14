package br.com.db1;

public class Texto {

	public String retornarEmMaisculo(String parametro) {
		return parametro.toUpperCase();
	}

	public String retornarEmMinusculo(String parametro) { //QUAL A DIFERENCA EM DEIXAR String ou Object?
		return parametro.toLowerCase();
	}

	public Integer contarCaracteres(String parametro) {
		return parametro.length();
	}

	public Integer contarCaracteresMenosBackspace(String parametro) {
		return parametro.trim().length();
	}

	public String nomeCompleto4PrimeirasLetras(String parametro) {
		return parametro.substring(0, 4);
	}

	public String nomeCompletoAPartirTerceiraLetra(String parametro) {
		return parametro.substring(2);
	}

	public String nomeCompleto4UltimasLetras(String parametro) {
		return parametro.substring(parametro.length() -4);
	}
}