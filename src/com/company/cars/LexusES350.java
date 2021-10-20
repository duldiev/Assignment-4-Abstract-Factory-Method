package com.company.cars;

import com.company.carspecs.CarSpecFactory;

public class LexusES350 extends Car {
    CarSpecFactory carSpecFactory;

    public LexusES350(CarSpecFactory carSpecFactory) {
        this.carSpecFactory = carSpecFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        color = carSpecFactory.createColor();
        engine = carSpecFactory.createEngine();
    }
}
