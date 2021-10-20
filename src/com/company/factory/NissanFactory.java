package com.company.factory;

import com.company.cars.Car;
import com.company.cars.Nissan350z;
import com.company.cars.SkylineGTR;
import com.company.carspecs.CarSpecFactory;
import com.company.carspecs.NissanSpecFactory;

public class NissanFactory extends FactoryCar {
    @Override
    protected Car createCar(String item) {
        Car car = null;
        CarSpecFactory carSpecFactory = new NissanSpecFactory();
        if (item.equals("GT-R R34")) {
            car = new SkylineGTR(carSpecFactory);
            car.setName("Nissan Skyline GT-R R34");
        } else if (item.equals("350z")) {
            car = new Nissan350z(carSpecFactory);
            car.setName("Nissan 350z");
        }
        return car;
    }
}
