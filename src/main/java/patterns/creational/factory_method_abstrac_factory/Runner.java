package patterns.creational.factory_method_abstrac_factory;

import patterns.creational.factory_method_abstrac_factory.factory.BikeCarFactory;
import patterns.creational.factory_method_abstrac_factory.factory.ElectroBikeCarFactory;
import patterns.creational.factory_method_abstrac_factory.factory.VehicleFactory;
import patterns.creational.factory_method_abstrac_factory.products.Bike;

/**
 * @author Oleksii Petrokhalko.
 */
public class Runner {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new BikeCarFactory();
        VehicleFactory vehicleFactory2 = new ElectroBikeCarFactory();
        Bike bike = vehicleFactory.createBike();
        System.out.println(vehicleFactory2.createBike().engine());
        System.out.println(bike.speed());



    }
}
