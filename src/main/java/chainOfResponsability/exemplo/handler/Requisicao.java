package chainOfResponsability.exemplo.handler;

public class Requisicao {

	private String item;
	private double valor;

	public Requisicao(String item, double valor) {
		this.item = item;
		this.setValor(valor);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
