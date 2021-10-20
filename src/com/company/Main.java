package com.company;

import com.company.cars.Car;
import com.company.factory.FactoryCar;
import com.company.factory.LexusFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.NissanFactory;

public class Main {

    public static void main(String[] args) {
        FactoryCar nissanFactory = new NissanFactory();
        FactoryCar lexusFactory = new LexusFactory();
        FactoryCar mercedesFactory = new MercedesFactory();

        Car car = nissanFactory.orderCar("GT-R R34");
        System.out.println("Paul ordered a " + car.getName() + "\n");

        car = lexusFactory.orderCar("ES 350");
        System.out.println("Han ordered a " + car.getName() + "\n");

        car = mercedesFactory.orderCar("GLS");
        System.out.println("Drake ordered a " + car.getName() + "\n");
    }
}
