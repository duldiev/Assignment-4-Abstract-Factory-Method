package com.company.cars;

import com.company.colors.Color;
import com.company.engines.Engine;

public abstract class Car {
    String name;
    Color color;
    Engine engine;

    public abstract void prepare();

//    System.out.println("Preparing " + name);
//    System.out.println("Painting the car...");
//    System.out.println("Setting new engine...");

    public void manufacture() {
        System.out.println("Manufacturing takes approximately 17-20 hours");
    }

    public void test() {
        System.out.println("Testing a new car");
    }

    public void deliver() {
        System.out.println("Delivering our car. It takes 5-7 days");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
