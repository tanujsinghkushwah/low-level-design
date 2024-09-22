package org.example.factorydesign.models;

import org.example.factorydesign.interfaces.ShapeInterface;

public class ShapeFactory {

    public ShapeInterface getShape(String desc) {
        if(desc==null){
            throw new RuntimeException("Invalid input");
        }

        switch (desc) {
            case "Circle" :
                return new Circle();
            case "Rectangle" :
                return new Rectangle();
            default:
                throw new RuntimeException("Case not recognized");
        }
    }
}
