package br.redesprou.com.AnalisadorBisexto;

import org.junit.Test;

import junit.framework.TestCase;

public class AnalisadorBissextoTest extends TestCase {
	AnalisadorBissexto analisador = new AnalisadorBissexto();
	
	
	@Test
	public void testNegativo() {
		assertFalse(analisador.ehBissexto(-1));
	}
	
	@Test
	public void testZero() {
		assertFalse(analisador.ehBissexto(0));
	}
	
	@Test
	public void testNaoBissexto() {
		assertFalse(analisador.ehBissexto(1));
	}
	
	@Test
	public void testBissextos() {
		assertTrue(analisador.ehBissexto(400));
		assertTrue(analisador.ehBissexto(16));
	}
	
	@Test
	public void testNaoBissextoDivisivelPorQuatro() {
		assertFalse(analisador.ehBissexto(100));
	}
}
