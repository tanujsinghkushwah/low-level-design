package org.example.abstractfactorydesign.interfaces;

public interface CarFactoryInterface {

    CarInterface createCar();

    CarSpecificationsInterface createCarSpecifications();
    
}
