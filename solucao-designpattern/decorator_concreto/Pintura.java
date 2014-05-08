package decorator_concreto;

import componente.TratamentoDeCabelo;

import decorator.TratamentoDeCabeloDecorator;

public class Pintura extends TratamentoDeCabeloDecorator {
	
	public Pintura(TratamentoDeCabelo tratamentoDeCabelo) {
		super(tratamentoDeCabelo);
	}
     
	@Override
    public String getDescricao() {
        return tratamentoDeCabelo.getDescricao() + "\nPinta o cabelo com uma determinada cor";
    }
 
	@Override
    public double getCusto() {
    	 return tratamentoDeCabelo.getCusto() + 20.00;
    }
	
}
