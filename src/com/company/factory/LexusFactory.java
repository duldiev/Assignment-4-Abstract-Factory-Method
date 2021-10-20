package com.company.factory;

import com.company.cars.Car;
import com.company.cars.LexusES350;
import com.company.cars.LexusIS350;
import com.company.carspecs.CarSpecFactory;
import com.company.carspecs.LexusSpecFactory;

public class LexusFactory extends FactoryCar {
    @Override
    protected Car createCar(String item) {
        Car car = null;
        CarSpecFactory carSpecFactory = new LexusSpecFactory();
        if (item.equals("ES 350")) {
            car = new LexusES350(carSpecFactory);
            car.setName("ES 350");
        } else if (item.equals("IS 350")) {
            car = new LexusIS350(carSpecFactory);
            car.setName("IS 350");
        }
        return car;
    }
}
