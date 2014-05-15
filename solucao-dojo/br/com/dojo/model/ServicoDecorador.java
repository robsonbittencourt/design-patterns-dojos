package br.com.dojo.model;

public abstract class ServicoDecorador implements Servico {

	protected Servico servico;
	
	public ServicoDecorador(Servico servico){
		this.servico = servico;
	}
	
	@Override
	public Double getCusto() {
		return servico.getCusto();
	}
	
	@Override
	public String getDescricao() {
		return servico.getDescricao();
	}

}
