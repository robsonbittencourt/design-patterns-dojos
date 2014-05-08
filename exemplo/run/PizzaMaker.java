package run;

import componente.Pizza;
import componente_concreto.PlainPizza;
import decorator_concreto.Mozzarella;
import decorator_concreto.TomatoSauce;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
	}

}
