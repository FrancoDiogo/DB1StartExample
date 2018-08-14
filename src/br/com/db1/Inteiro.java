package br.com.db1;

public class Inteiro {

	public Integer somar(Integer parametro1, Integer parametro2) {
		return parametro1 + parametro2;
	}

	public Integer subtrair(Integer parametro1, Integer parametro2) {
		return parametro1 - parametro2;
	}

	public Integer multiplicar(Integer parametro1, Integer parametro2) {
		return parametro1 * parametro2;
	}

	public Integer dividir(Integer parametro1, Integer parametro2) {
		return parametro1 / parametro2;
		//FALTA A EXCECAO DE DIVIDIR POR 0
	}

	public Integer numeroMaior(Integer parametro1, Integer parametro2) {
		return Math.max(parametro1, parametro2);
	}

	public Boolean ehPar(Integer parametro) {
		return parametro % 2 == 0;
	}
}