package org.example.decoratordesign.models;

public class Margherita extends BasePizza{

    public Margherita() {
       description = "Margherita";
    }
    @Override
    public Integer getCost() {
        return 150;
    }
}
