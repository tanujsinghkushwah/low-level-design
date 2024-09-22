package org.example.decoratordesign.models;

public class VeggieLoaded extends BasePizza{

    public VeggieLoaded() {
        description = "Veggie Loaded";
    }
    @Override
    public Integer getCost() {
        return 300;
    }
}
