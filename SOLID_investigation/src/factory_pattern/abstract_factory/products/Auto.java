package factory_pattern.abstract_factory.products;

public interface Auto {
    default void create(){
        System.out.println(getClass().getSimpleName() + " has been created");
    }
}
