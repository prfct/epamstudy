package patterns.creational.factory_method_abstrac_factory.factory;

import patterns.creational.factory_method_abstrac_factory.products.Bike;
import patterns.creational.factory_method_abstrac_factory.products.Car;

/**
 * @author Oleksii Petrokhalko.
 */
public interface VehicleFactory {
    Bike createBike();

    Car createCar();
}
