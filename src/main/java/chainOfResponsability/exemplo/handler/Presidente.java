package chainOfResponsability.exemplo.handler;

public class Presidente extends AprovadorHandler {

	@Override
	protected boolean podeAutorizar(double valor) {
		return true;
	}

	@Override
	protected void liberaRequisicao() {
		System.out.println("Presidente liberando requisição.");
	}

}
