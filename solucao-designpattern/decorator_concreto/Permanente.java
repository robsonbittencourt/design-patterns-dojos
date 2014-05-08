package decorator_concreto;

import componente.TratamentoDeCabelo;

import decorator.TratamentoDeCabeloDecorator;

public class Permanente extends TratamentoDeCabeloDecorator {
	
	public Permanente(TratamentoDeCabelo tratamentoDeCabelo) {
		super(tratamentoDeCabelo);
	}
     
	@Override
    public String getDescricao() {
        return tratamentoDeCabelo.getDescricao() + "\nAdiciona química e coloca rolos nos cabelos";
    }
 
	@Override
    public double getCusto() {
    	 return tratamentoDeCabelo.getCusto() + 75.00;
    }
	
}
