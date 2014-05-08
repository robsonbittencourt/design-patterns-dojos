package componente_concreto;

import componente.TratamentoDeCabelo;

public class CorteBasico implements TratamentoDeCabelo {

	@Override
	public String getDescricao() {
		return "\nCorta o cabelo";
	}

	@Override
	public double getCusto() {
		return 10.00;
	}

}
