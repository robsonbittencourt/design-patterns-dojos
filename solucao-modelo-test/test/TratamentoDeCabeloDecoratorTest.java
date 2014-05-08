package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import componente.TratamentoDeCabelo;
import componente_concreto.CorteBasico;

import decorator_concreto.Permanente;
import decorator_concreto.Pintura;


public class TratamentoDeCabeloDecoratorTest {
	
	@Test
	public void deveRetornarDescricaoDeCorteDeCabeloSempre() {
		TratamentoDeCabelo tratamento = new CorteBasico();
		
		assertEquals("\nCorta o cabelo", tratamento.getDescricao());
	}
	
	@Test
	public void deveRetornarDescricaoDePermanenteQuandoPermanenteForEscolhidoEDescricaoForSolicitada() {
		TratamentoDeCabelo tratamentos = new Permanente(new CorteBasico());
		
		assertEquals("\nCorta o cabelo\nAdiciona quimica e coloca rolos nos cabelos", tratamentos.getDescricao());
	}
	
	@Test
	public void deveRetornarDescricaoDePinturaQuandoPinturaForEscolhidoEDescricaoForSolicitada() {
		TratamentoDeCabelo tratamentos = new Pintura(new CorteBasico());
		
		assertEquals("\nCorta o cabelo\nPinta o cabelo com uma determinada cor", tratamentos.getDescricao());
	}
	
	@Test
	public void deveRetornarDescricaoDeTodosTratamentosDeCabeloQuandoTodosForemEscolhidosEDescricaoForSolicitada() {
		TratamentoDeCabelo tratamentos = new Pintura(new Permanente(new CorteBasico()));
		
		assertEquals("\nCorta o cabelo\nAdiciona quimica e coloca rolos nos cabelos\nPinta o cabelo com uma determinada cor", tratamentos.getDescricao());
	}
	
	@Test
	public void deveRetornarCustoDeCorteDeCabeloSempre() {
		TratamentoDeCabelo tratamento = new CorteBasico();
		
		assertEquals(10.00, tratamento.getCusto(), 0.0);
	}
	
	@Test
	public void deveRetornarCustoDePermanenteQuandoPermanenteForEscolhidoECustoForSolicitado() {
		TratamentoDeCabelo tratamentos = new Permanente(new CorteBasico());
		
		assertEquals(85.00, tratamentos.getCusto(), 0.0);
	}
	
	@Test
	public void deveRetornarCustoDePinturaQuandoPinturaForEscolhidoECustoForSolicitado() {
		TratamentoDeCabelo tratamentos = new Pintura(new CorteBasico());
		
		assertEquals(30.00, tratamentos.getCusto(), 0.0);
	}
	
	@Test
	public void deveRetornarCustoDeTodosTratamentosDeCabeloQuandoTodosForemEscolhidosECustoForSolicitado() {
		TratamentoDeCabelo tratamentos = new Pintura(new Permanente(new CorteBasico()));
		
		assertEquals(105.00, tratamentos.getCusto(), 0.0);
	}

}
