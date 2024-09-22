package org.example.abstractfactorydesign.models;

import org.example.abstractfactorydesign.interfaces.CarSpecificationsInterface;

public class NorthAmericaSpecification implements CarSpecificationsInterface {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
