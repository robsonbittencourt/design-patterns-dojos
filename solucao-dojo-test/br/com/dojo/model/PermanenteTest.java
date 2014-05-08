package br.com.dojo.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class PermanenteTest {
	
	@Test
	public void deveRetornar85PilaQuandoAdicionarPermanenteAoCorte(){
		Corte corte = new Corte();
		Permanente permanente = new Permanente(corte);
		assertEquals(85.0, permanente.getCusto(), 0.0);
	}
}
