package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InteiroTest {
	
	Inteiro inteiro = new Inteiro();
	
	@Test
	public void somarTest() {
		assertTrue(4 == inteiro.somar(2, 2));
		assertFalse(4 == inteiro.somar(1, 2));
	}
	
	@Test
	public void subtrairTest() {
		assertTrue(4 == inteiro.subtrair(8, 4));
		assertFalse(3 == inteiro.subtrair(9, 4));
	}
	
	@Test
	public void multiplicarTest() {
		assertTrue(8 == inteiro.multiplicar(4, 2));
		assertFalse(7 == inteiro.multiplicar(4, 2));
	}
	
	@Test
	public void dividirTest() {
		assertTrue(2 == inteiro.dividir(10, 5));
		assertFalse(3 == inteiro.dividir(10, 5));
		//FALTA A EXCECAO DE DIVIDIR POR 0
	}
	
	@Test
	public void numeroMaiorTest() {
		assertTrue(99 == inteiro.numeroMaior(98, 99));
		assertFalse(98 == inteiro.numeroMaior(98, 99));
	}
	
	@Test
	public void ehParTest() {
		assertTrue(inteiro.ehPar(2));
		assertFalse(inteiro.ehPar(11));
	}
}