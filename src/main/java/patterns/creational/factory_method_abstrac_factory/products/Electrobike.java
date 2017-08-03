package patterns.creational.factory_method_abstrac_factory.products;

/**
 * @author Oleksii Petrokhalko.
 */
public class Electrobike implements Bike {

    @Override
    public int speed() {
        return 50;
    }

    @Override
    public String engine() {
        return "electro";
    }
}
