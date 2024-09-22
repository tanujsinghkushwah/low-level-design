package org.example.abstractfactorydesign.interfaces;

import org.example.abstractfactorydesign.models.NorthAmericaSpecification;
import org.example.abstractfactorydesign.models.Sedan;

public class EuropeanFactory implements CarFactoryInterface {

    @Override
    public CarInterface createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecificationsInterface createCarSpecifications() {
        return new NorthAmericaSpecification();
    }
}
