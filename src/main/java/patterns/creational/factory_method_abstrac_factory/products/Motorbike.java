package patterns.creational.factory_method_abstrac_factory.products;

/**
 * @author Oleksii Petrokhalko.
 */
public class Motorbike implements Bike {

    @Override
    public int speed() {
        return 100;
    }

    @Override
    public String engine() {
        return "inner";
    }
}
