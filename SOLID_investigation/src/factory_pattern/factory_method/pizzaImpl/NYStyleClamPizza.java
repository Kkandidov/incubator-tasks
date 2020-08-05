package factory_pattern.factory_method.pizzaImpl;

import factory_pattern.factory_method.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
