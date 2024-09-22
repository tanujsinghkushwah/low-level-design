package org.example.factorydesign.models;

import org.example.factorydesign.interfaces.ShapeInterface;

public class Circle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Circle has been drawn.");
    }
}
