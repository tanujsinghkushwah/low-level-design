package org.example.decoratordesign.models;

public class MushroomTopping extends ToppingDecorator{

    public BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+"+Mushrooms";
    }

    @Override
    public Integer getCost() {
        return this.basePizza.getCost()+30;
    }
}
