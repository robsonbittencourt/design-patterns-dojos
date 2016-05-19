package decorator.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeTratamentoDeCabeloTest {

	private Servico servico;

	@Before
	public void setUp() {
		servico = new Corte();
	}

	@Test
	public void deveRetornarDescricaoDeCorteDeCabeloSempre() {
		assertEquals("\nCorta o cabelo", servico.getDescricao());
	}

	@Test
	public void deveRetornarDescricaoDePermanenteQuandoPermanenteForEscolhidoEDescricaoForSolicitada() {
		servico = new Permanente(servico);
		assertEquals("\nCorta o cabelo\nAdiciona quimica e coloca rolos nos cabelos", servico.getDescricao());
	}

	@Test
	public void deveRetornarDescricaoDePinturaQuandoPinturaForEscolhidoEDescricaoForSolicitada() {
		servico = new Pintura(servico);
		assertEquals("\nCorta o cabelo\nPinta o cabelo com uma determinada cor", servico.getDescricao());
	}

	@Test
	public void deveRetornarDescricaoDeTodosTratamentosDeCabeloQuandoTodosForemEscolhidosEDescricaoForSolicitada() {
		servico = new Permanente(servico);
		servico = new Pintura(servico);
		assertEquals(
				"\nCorta o cabelo\nAdiciona quimica e coloca rolos nos cabelos\nPinta o cabelo com uma determinada cor",
				servico.getDescricao());
	}

	@Test
	public void deveRetornarCustoDeCorteDeCabeloSempre() {
		assertEquals(10.00, servico.getCusto(), 0.0);
	}

	@Test
	public void deveRetornarCustoDePermanenteQuandoPermanenteForEscolhidoECustoForSolicitado() {
		servico = new Permanente(servico);

		assertEquals(85.00, servico.getCusto(), 0.0);
	}

	@Test
	public void deveRetornarCustoDePinturaQuandoPinturaForEscolhidoECustoForSolicitado() {
		servico = new Pintura(servico);

		assertEquals(30.00, servico.getCusto(), 0.0);
	}

	@Test
	public void deveRetornarCustoDeTodosTratamentosDeCabeloQuandoTodosForemEscolhidosECustoForSolicitado() {
		servico = new Permanente(servico);
		servico = new Pintura(servico);

		assertEquals(105.00, servico.getCusto(), 0.0);
	}

}
