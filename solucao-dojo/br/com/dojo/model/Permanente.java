package br.com.dojo.model;

public class Permanente extends ServicoDecorador {

	public Permanente(Servico servico) {
		super(servico);
	}
	
	@Override
	public Double getCusto() {
		return super.getCusto()+75.0;
	}

}
