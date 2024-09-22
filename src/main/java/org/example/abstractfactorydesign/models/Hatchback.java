package org.example.abstractfactorydesign.models;

import org.example.abstractfactorydesign.interfaces.CarInterface;

public class Hatchback implements CarInterface {
    @Override
    public void assemble() {
        System.out.println("Created a new hatchback!!");
    }
}
