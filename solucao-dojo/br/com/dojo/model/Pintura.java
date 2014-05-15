package br.com.dojo.model;

public class Pintura extends ServicoDecorador{

	public Pintura(Servico corte) {
		super(corte);
	}
	
	@Override
	public Double getCusto() {
		return super.getCusto()+20.0;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao()+"\nPinta o cabelo com uma determinada cor";
	}
}
