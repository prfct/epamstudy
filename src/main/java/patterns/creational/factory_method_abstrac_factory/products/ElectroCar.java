package patterns.creational.factory_method_abstrac_factory.products;

/**
 * @author Oleksii Petrokhalko.
 */
public class ElectroCar implements Car {
    @Override
    public String fuel() {
        return "electricity";
    }

    @Override
    public int speed() {
        return 1000;
    }
}
