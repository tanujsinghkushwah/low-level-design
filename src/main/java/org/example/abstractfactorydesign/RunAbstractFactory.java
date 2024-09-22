package org.example.abstractfactorydesign;

import org.example.abstractfactorydesign.interfaces.CarFactoryInterface;
import org.example.abstractfactorydesign.interfaces.CarInterface;
import org.example.abstractfactorydesign.interfaces.CarSpecificationsInterface;
import org.example.abstractfactorydesign.interfaces.NorthAmericanFactory;
import org.example.abstractfactorydesign.models.NorthAmericaSpecification;

public class RunAbstractFactory {

    public void runDesignPattern() {
        CarFactoryInterface americanFactory = new NorthAmericanFactory();
        CarInterface americanCar = americanFactory.createCar();
        americanCar.assemble();

        CarSpecificationsInterface americanCarSpec = new NorthAmericaSpecification();
        americanCarSpec.display();

    }
}
