package chainOfResponsability.exemplo.handler;

public class Gerente extends AprovadorHandler {

	@Override
	protected boolean podeAutorizar(double valor) {
		return valor < 500;
	}

	@Override
	protected void liberaRequisicao() {
		System.out.println("Gerente liberando requisição.");
	}

}
