package br.com.dojo.model;

public class Pintura extends ServicoDecorador{

	public Pintura(Servico corte) {
		super(corte);
	}
	
	@Override
	public Double getCusto() {
		return super.getCusto()+20.0;
	}
}
