package chainOfResponsability.exemplo.cliente;

import chainOfResponsability.exemplo.handler.AprovadorHandler;
import chainOfResponsability.exemplo.handler.Encarregado;
import chainOfResponsability.exemplo.handler.Gerente;
import chainOfResponsability.exemplo.handler.Presidente;
import chainOfResponsability.exemplo.handler.Requisicao;

public class Cliente {

	public static void main(String[] args) {

		AprovadorHandler encarregado = new Encarregado();
		AprovadorHandler gerente = new Gerente();
		AprovadorHandler presidente = new Presidente();

		encarregado.setProximoHandler(gerente);
		gerente.setProximoHandler(presidente);

		encarregado.requisitarItem(new Requisicao("Teclado", 490));

	}

}
