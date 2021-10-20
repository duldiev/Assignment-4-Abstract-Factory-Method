package com.company.cars;

import com.company.carspecs.CarSpecFactory;

public class Nissan350z extends Car {
    CarSpecFactory carSpecFactory;

    public Nissan350z(CarSpecFactory carSpecFactory) {
        this.carSpecFactory = carSpecFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        color = carSpecFactory.createColor();
        engine = carSpecFactory.createEngine();
    }
}
