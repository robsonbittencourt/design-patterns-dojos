package decorator.exemplo.cliente;

import decorator.exemplo.componente.Pizza;
import decorator.exemplo.componente.PlainPizza;
import decorator.exemplo.decorador.Mozzarella;
import decorator.exemplo.decorador.TomatoSauce;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
	}

}
