package factory_pattern.factory_idiom;

public abstract class Pizza {
    void prepare() {
        System.out.println(getName() + " prepared");
    }

    void bake() {
        System.out.println(getName() + " baked");
    }

    void cut() {
        System.out.println(getName() + " cut");
    }

    void box() {
        System.out.println(getName() + " boxed");
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getName();
    }
}
