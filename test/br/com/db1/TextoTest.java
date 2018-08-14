package br.com.db1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TextoTest {
	
	Texto texto = new Texto();
	
	@Test
	public void retornarEmMaiusculoTest() {
		assertEquals("DIOGO", texto.retornarEmMaisculo("diogo"));
	}
	
	@Test
	public void retornarEmMinusculoTest() {
		assertEquals("diogo", texto.retornarEmMinusculo("DIOGO"));
	}
	
	@Test
	public void contarCaracteresTest() {
		assertTrue(8 == texto.contarCaracteres("DB1START"));
		assertFalse(9 == texto.contarCaracteres("DB1START"));
		assertTrue(10 == texto.contarCaracteres(" DB1START "));
	}
	
	@Test
	public void contarCaracteresMenosBackspaceTest() {
		assertTrue(8 == texto.contarCaracteresMenosBackspace(" DB1START "));
		assertFalse(10 == texto.contarCaracteresMenosBackspace(" DB1START "));
	}
}