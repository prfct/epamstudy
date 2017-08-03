package patterns.creational.factory_method_abstrac_factory.products;

/**
 * @author Oleksii Petrokhalko.
 */
public class SportCar implements Car {

    @Override
    public String fuel() {
        return "gasoline";
    }

    @Override
    public int speed() {
        return 200;
    }
}
