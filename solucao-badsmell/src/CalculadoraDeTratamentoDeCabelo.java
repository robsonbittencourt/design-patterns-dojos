package src;

import java.util.List;

public class CalculadoraDeTratamentoDeCabelo {
	
	private List<String> opcoes;
	
	public CalculadoraDeTratamentoDeCabelo(List<String> opcoes){
		this.opcoes = opcoes;
    }
     
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
    	
    	for (String opcao : opcoes) {
		    if(opcao.equals("Permanente")){
		    	sb.append("\nAdiciona química e coloca rolos nos cabelos");
		    	continue;
	        } 
		    if(opcao.equals("Pintura")){
		    	sb.append("\nPinta o cabelo com uma determinada cor");
		    	continue;
		    }
		    
		    sb.append("\nCorta o cabelo");
		}

	    return sb.toString();
    }
 
    public double getCusto() {
    	double custo = 0.0;
    	
    	for (String opcao : opcoes) {
		    if(opcao.equals("Permanente")){
		    	custo += 75.00;
		    	continue;
	        } 
		    if(opcao.equals("Pintura")){
		    	custo += 20.00;
		    	continue;
		    }
		    
		    custo += 10.00;
		}

	    return custo;
    }
}
