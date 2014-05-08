package br.com.dojo.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PinturaTest {
	
	@Test
	public void deveRetornar30PilaCorteMaisPintura(){
		Corte corte = new Corte();
		Pintura pintura = new Pintura(corte);
		double custoEsperado = 30.0;
		assertEquals(custoEsperado,pintura.getCusto(),0.0);
	}

}
