package patterns.creational.factory_method_abstrac_factory.factory;

import patterns.creational.factory_method_abstrac_factory.products.*;

/**
 * @author Oleksii Petrokhalko.
 */
public class BikeCarFactory implements VehicleFactory {
    @Override
    public Bike createBike() {
        return new Motorbike();
    }

    @Override
    public Car createCar() {
        return new SportCar();
    }
}
