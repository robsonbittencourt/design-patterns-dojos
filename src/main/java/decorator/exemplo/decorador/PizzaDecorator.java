package decorator.exemplo.decorador;

import decorator.exemplo.componente.Pizza;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza tempPizza;

	public PizzaDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}

	public String getDescription() {
		return tempPizza.getDescription();
	}

	public double getCost() {
		return tempPizza.getCost();
	}

}
