package decorator.exemplo.decorador;

import decorator.exemplo.componente.Pizza;

public class TomatoSauce extends PizzaDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", tomato sauce";
	}

	public double getCost() {
		System.out.println("Cost of Sauce: " + .35);
		return tempPizza.getCost() + .35;
	}

}
