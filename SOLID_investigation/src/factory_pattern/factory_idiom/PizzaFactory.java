package factory_pattern.factory_idiom;

import factory_pattern.factory_idiom.enums.PizzaName;
import factory_pattern.factory_idiom.pizzaImpl.CheesePizza;
import factory_pattern.factory_idiom.pizzaImpl.ClamPizza;
import factory_pattern.factory_idiom.pizzaImpl.PepperoniPizza;
import factory_pattern.factory_idiom.pizzaImpl.VeggiePizza;

public class PizzaFactory {

    public Pizza createPizza(PizzaName pizzaName) {
        Pizza pizza;

        switch (pizzaName){
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            default:
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}
