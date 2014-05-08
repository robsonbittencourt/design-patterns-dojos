package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import src.CalculadoraDeTratamentoDeCabelo;

public class CalculadoraDeTratamentoDeCabeloTest {
	
	@Test
	public void deveRetornarDescricaoDeCorteDeCabeloSempre() {
		List<String> opcoes = Arrays.asList();
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals("\nCorta o cabelo", calculadora.getDescricao());
	}
	
	@Test
	public void deveRetornarDescricaoDePermanenteQuandoPermanenteForEscolhidoEDescricaoForSolicitada() {
		List<String> opcoes = Arrays.asList("Permanente");
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals("\nCorta o cabelo\nAdiciona quimica e coloca rolos nos cabelos", calculadora.getDescricao());
	}
	
	@Test
	public void deveRetornarDescricaoDePinturaQuandoPinturaForEscolhidoEDescricaoForSolicitada() {
		List<String> opcoes = Arrays.asList("Pintura");
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals("\nCorta o cabelo\nPinta o cabelo com uma determinada cor", calculadora.getDescricao());
	}
	
	@Test
	public void deveRetornarDescricaoDeTodosTratamentosDeCabeloQuandoTodosForemEscolhidosEDescricaoForSolicitada() {
		List<String> opcoes = Arrays.asList("Permanente", "Pintura");
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals("\nCorta o cabelo\nAdiciona quimica e coloca rolos nos cabelos\nPinta o cabelo com uma determinada cor", calculadora.getDescricao());
	}
	
	@Test
	public void deveRetornarCustoDeCorteDeCabeloSempre() {
		List<String> opcoes = Arrays.asList();
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals(10.00, calculadora.getCusto(), 0.0);
	}
	
	@Test
	public void deveRetornarCustoDePermanenteQuandoPermanenteForEscolhidoECustoForSolicitado() {
		List<String> opcoes = Arrays.asList("Permanente");
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals(85.00, calculadora.getCusto(), 0.0);
	}
	
	@Test
	public void deveRetornarCustoDePinturaQuandoPinturaForEscolhidoECustoForSolicitado() {
		List<String> opcoes = Arrays.asList("Pintura");
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals(30.00, calculadora.getCusto(), 0.0);
	}
	
	@Test
	public void deveRetornarCustoDeTodosTratamentosDeCabeloQuandoTodosForemEscolhidosECustoForSolicitado() {
		List<String> opcoes = Arrays.asList("Permanente", "Pintura");
		CalculadoraDeTratamentoDeCabelo calculadora = new CalculadoraDeTratamentoDeCabelo(opcoes);
		
		assertEquals(105.00, calculadora.getCusto(), 0.0);
	}
	
}
