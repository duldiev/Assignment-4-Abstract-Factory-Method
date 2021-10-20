package com.company.cars;

import com.company.carspecs.CarSpecFactory;

public class MaybachGLS extends Car {
    CarSpecFactory carSpecFactory;

    public MaybachGLS(CarSpecFactory carSpecFactory) {
        this.carSpecFactory = carSpecFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        color = carSpecFactory.createColor();
        engine = carSpecFactory.createEngine();
    }
}
