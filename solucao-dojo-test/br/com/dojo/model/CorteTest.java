package br.com.dojo.model;

import static org.junit.Assert.*;

import org.junit.Test;


public class CorteTest {

	
	
	@Test
	public void deveRetornar10pilaParaCorteComum(){
		Corte corte = new Corte();
		assertEquals(10.0, corte.getCusto(),0.0 );
	}
}
