package factory_pattern.factory_method;

import factory_pattern.factory_method.enums.PizzaName;
import factory_pattern.factory_method.pizzaStoreImpl.CaliforniaPizzaStore;
import factory_pattern.factory_method.pizzaStoreImpl.ChicagoPizzaStore;
import factory_pattern.factory_method.pizzaStoreImpl.NYPizzaStore;

public class ClientMain {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza(PizzaName.CHEESE);
        System.out.println(nyPizza.getName());
        System.out.println();

        Pizza chPizza = chicagoPizzaStore.orderPizza(PizzaName.VEGGIE);
        System.out.println(chPizza.getName());
        System.out.println();

        Pizza calPizza = californiaPizzaStore.orderPizza(PizzaName.PEPPERONI);
        System.out.println(calPizza.getName());
        System.out.println();
    }
}
