package patterns.creational.factory_method_abstrac_factory.factory;

import patterns.creational.factory_method_abstrac_factory.products.Bike;
import patterns.creational.factory_method_abstrac_factory.products.Car;
import patterns.creational.factory_method_abstrac_factory.products.ElectroCar;
import patterns.creational.factory_method_abstrac_factory.products.Electrobike;

/**
 * @author Oleksii Petrokhalko.
 */
public class ElectroBikeCarFactory implements VehicleFactory {

    @Override
    public Bike createBike() {
        return new Electrobike();
    }

    @Override
    public Car createCar() {
        return new ElectroCar();
    }
}
