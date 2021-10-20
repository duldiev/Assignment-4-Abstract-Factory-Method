package com.company.factory;

import com.company.cars.Car;
import com.company.cars.MaybachGLS;
import com.company.cars.MaybachSClass;
import com.company.carspecs.CarSpecFactory;
import com.company.carspecs.MercedesSpecFactory;

public class MercedesFactory extends FactoryCar {
    @Override
    protected Car createCar(String item) {
        Car car = null;
        CarSpecFactory carSpecFactory = new MercedesSpecFactory();
        if (item.equals("GLS")) {
            car = new MaybachGLS(carSpecFactory);
            car.setName("GLS 650");
        } else if (item.equals("S-Class")) {
            car = new MaybachSClass(carSpecFactory);
            car.setName("S-Class");
        }
        return car;
    }
}
