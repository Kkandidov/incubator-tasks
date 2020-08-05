package factory_pattern.factory_method.pizzaImpl;

import factory_pattern.factory_method.Pizza;

public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        name = "California Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
