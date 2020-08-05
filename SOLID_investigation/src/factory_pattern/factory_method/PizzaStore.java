package factory_pattern.factory_method;

import factory_pattern.factory_method.enums.PizzaName;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaName pizzaName){
        Pizza pizza = createPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // factory method
    public abstract Pizza createPizza(PizzaName pizzaName);
}
