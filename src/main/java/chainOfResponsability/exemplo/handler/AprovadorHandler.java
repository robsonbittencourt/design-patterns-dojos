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

	protected abstract boolean podeAutorizar(double valor);

	protected abstract void liberaRequisicao();

	public void setProximoHandler(AprovadorHandler proximoHandler) {
		this.proximoHandler = proximoHandler;
	}

}
