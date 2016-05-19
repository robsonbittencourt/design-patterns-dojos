package decorator.dojo;

public class Permanente extends ServicoDecorador {

	public Permanente(Servico servico) {
		super(servico);
	}

	@Override
	public Double getCusto() {
		return super.getCusto() + 75.0;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + "\nAdiciona quimica e coloca rolos nos cabelos";
	}

}
