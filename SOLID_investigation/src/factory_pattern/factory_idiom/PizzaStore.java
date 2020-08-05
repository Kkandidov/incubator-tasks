package factory_pattern.factory_idiom;

import factory_pattern.factory_idiom.enums.PizzaName;

public class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaName pizzaName){
        Pizza pizza = pizzaFactory.createPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
