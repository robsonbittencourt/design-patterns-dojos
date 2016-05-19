package decorator.dojo;

public class Corte implements Servico {

	public Double getCusto() {
		return 10.0;
	}

	@Override
	public String getDescricao() {
		return "\nCorta o cabelo";
	}

}
