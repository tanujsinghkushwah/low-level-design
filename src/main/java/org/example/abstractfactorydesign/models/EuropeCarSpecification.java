package org.example.abstractfactorydesign.models;

import org.example.abstractfactorydesign.interfaces.CarSpecificationsInterface;

public class EuropeCarSpecification implements CarSpecificationsInterface {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
