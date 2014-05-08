package src;

import java.util.List;

import br.com.dojo.model.Corte;
import br.com.dojo.model.Servico;

public class CalculadoraDeTratamentoDeCabelo {
	
	private List<String> opcoes;
	private List<Servico> servicos; 
	
	public CalculadoraDeTratamentoDeCabelo(List<String> opcoes){
		this.opcoes = opcoes;
    }
     
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nCorta o cabelo");
    	for (String opcao : opcoes) {
		    if(opcao.equals("Permanente")){
		    	sb.append("\nAdiciona quimica e coloca rolos nos cabelos");
		    	continue;
	        } 
		    if(opcao.equals("Pintura")){
		    	sb.append("\nPinta o cabelo com uma determinada cor");
		    	continue;
		    }
		   
		}

	    return sb.toString();
    }
 
    public double getCusto() {
    	Corte corte = new Corte();
    	double custo = corte.getCusto();
    	
    	for (String opcao : opcoes) {
		    if(opcao.equals("Permanente")){
		    	custo += 75.00;
		    	continue;
	        } 
		    if(opcao.equals("Pintura")){
		    	custo += 20.00;
		    	continue;
		    }
		}

	    return custo;
    }
}
