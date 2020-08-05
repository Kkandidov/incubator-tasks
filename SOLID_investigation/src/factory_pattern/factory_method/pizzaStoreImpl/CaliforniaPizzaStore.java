package factory_pattern.factory_method.pizzaStoreImpl;

import factory_pattern.factory_method.Pizza;
import factory_pattern.factory_method.PizzaStore;
import factory_pattern.factory_method.enums.PizzaName;
import factory_pattern.factory_method.pizzaImpl.CaliforniaStyleCheesePizza;
import factory_pattern.factory_method.pizzaImpl.CaliforniaStyleClamPizza;
import factory_pattern.factory_method.pizzaImpl.CaliforniaStylePepperoniPizza;
import factory_pattern.factory_method.pizzaImpl.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaName pizzaName) {
        Pizza pizza;

        switch (pizzaName){
            case CHEESE:
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case PEPPERONI:
                pizza = new CaliforniaStylePepperoniPizza();
                break;
            case CLAM:
                pizza = new CaliforniaStyleClamPizza();
                break;
            default:
                pizza = new CaliforniaStyleVeggiePizza();
                break;
        }

        return pizza;
    }
}
