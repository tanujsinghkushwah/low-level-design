package org.example.factorydesign;

import org.example.factorydesign.interfaces.ShapeInterface;
import org.example.factorydesign.models.ShapeFactory;

public class RunFactory {

    public void runDesignPattern() {
        ShapeFactory shapeFactory = new ShapeFactory();

        ShapeInterface circle = shapeFactory.getShape("Circle");
        circle.draw();

        ShapeInterface rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

//        ShapeInterface unknown = shapeFactory.getShape("Unknown");
//        unknown.draw();
    }
}
