package org.example.decoratordesign;

import org.example.decoratordesign.models.*;

public class RunDecorator {

    public void runDesignPattern() {
        BasePizza basePizza = new MushroomTopping( new CheeseTopping(new VeggieLoaded()));
        System.out.println("Cost of "+basePizza.getDescription()+": "+basePizza.getCost());

    }
}
