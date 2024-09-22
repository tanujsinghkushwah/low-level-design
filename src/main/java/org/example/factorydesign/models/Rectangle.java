package org.example.factorydesign.models;

import org.example.factorydesign.interfaces.ShapeInterface;

public class Rectangle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn.");
    }
}
