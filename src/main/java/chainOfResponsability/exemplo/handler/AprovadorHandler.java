package chainOfResponsability.exemplo.handler;

public abstract class AprovadorHandler {

	protected AprovadorHandler proximoHandler;

	public void requisitarItem(Requisicao requisicao) {
		if (podeAutorizar(requisicao.getValor())) {
			liberaRequisicao();
		} else {
			proximoHandler.requisitarItem(requisicao);
		}
	}

	abstract protected boolean podeAutorizar(double valor);

	abstract protected void liberaRequisicao();

	public void setProximoHandler(AprovadorHandler proximoHandler) {
		this.proximoHandler = proximoHandler;
	}

}
