package org.example.abstractfactorydesign.models;

import org.example.abstractfactorydesign.interfaces.CarInterface;

public class Sedan implements CarInterface {
    @Override
    public void assemble() {
        System.out.println("Created a new sedan!!");
    }
}
