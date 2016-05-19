package chainOfResponsability.exemplo.handler;

public class Encarregado extends AprovadorHandler {

	@Override
	protected boolean podeAutorizar(double valor) {
		return valor < 100;
	}

	@Override
	protected void liberaRequisicao() {
		System.out.println("Encarregado liberando requisição.");
	}

}
