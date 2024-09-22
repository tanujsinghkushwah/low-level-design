package org.example.abstractfactorydesign.interfaces;

import org.example.abstractfactorydesign.models.Hatchback;
import org.example.abstractfactorydesign.models.NorthAmericaSpecification;

public class NorthAmericanFactory implements CarFactoryInterface{
    @Override
    public CarInterface createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecificationsInterface createCarSpecifications() {
        return new NorthAmericaSpecification();
    }
}
