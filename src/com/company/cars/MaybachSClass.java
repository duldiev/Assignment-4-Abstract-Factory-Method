package com.company.cars;

import com.company.carspecs.CarSpecFactory;

public class MaybachSClass extends Car {
    CarSpecFactory carSpecFactory;

    public MaybachSClass(CarSpecFactory carSpecFactory) {
        this.carSpecFactory = carSpecFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        color = carSpecFactory.createColor();
        engine = carSpecFactory.createEngine();
    }
}
