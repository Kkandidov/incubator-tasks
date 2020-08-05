package factory_pattern.factory_idiom;

import factory_pattern.factory_idiom.enums.PizzaName;

public class ClientMain {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new PizzaFactory());

        Pizza pizza = store.orderPizza(PizzaName.CHEESE);

        System.out.println(pizza);
    }
}
