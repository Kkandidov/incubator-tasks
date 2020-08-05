package factory_pattern.factory_method.pizzaStoreImpl;

import factory_pattern.factory_method.Pizza;
import factory_pattern.factory_method.PizzaStore;
import factory_pattern.factory_method.enums.PizzaName;
import factory_pattern.factory_method.pizzaImpl.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaName pizzaName) {
        Pizza pizza;

        switch (pizzaName){
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleClamPizza();
                break;
            default:
                pizza = new ChicagoStyleVeggiePizza();
                break;
        }

        return pizza;
    }
}
