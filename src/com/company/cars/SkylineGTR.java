package com.company.cars;

import com.company.carspecs.CarSpecFactory;

public class SkylineGTR extends Car {
    CarSpecFactory carSpecFactory;

    public SkylineGTR(CarSpecFactory carSpecFactory) {
        this.carSpecFactory = carSpecFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        color = carSpecFactory.createColor();
        engine = carSpecFactory.createEngine();
    }
}
