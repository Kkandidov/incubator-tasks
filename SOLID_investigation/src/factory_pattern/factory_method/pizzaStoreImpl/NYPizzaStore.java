package factory_pattern.factory_method.pizzaStoreImpl;

import factory_pattern.factory_method.Pizza;
import factory_pattern.factory_method.PizzaStore;
import factory_pattern.factory_method.enums.PizzaName;
import factory_pattern.factory_method.pizzaImpl.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaName pizzaName) {
        Pizza pizza;

        switch (pizzaName){
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            case CLAM:
                pizza = new NYStyleClamPizza();
                break;
            default:
                pizza = new NYStyleVeggiePizza();
                break;
        }

        return pizza;
    }
}
