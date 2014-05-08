package decorator;

import componente.TratamentoDeCabelo;


public abstract class TratamentoDeCabeloDecorator implements TratamentoDeCabelo {
	
	protected TratamentoDeCabelo tratamentoDeCabelo;
    
	protected TratamentoDeCabeloDecorator(TratamentoDeCabelo tratamentoDeCabelo){
        this.tratamentoDeCabelo = tratamentoDeCabelo;
    }
     
    public String getDescricao(){
        return tratamentoDeCabelo.getDescricao();
    }
     
    public double getCusto(){
        return tratamentoDeCabelo.getCusto();
    }
}
