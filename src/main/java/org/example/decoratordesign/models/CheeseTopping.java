package org.example.decoratordesign.models;

public class CheeseTopping extends ToppingDecorator {

    public BasePizza basePizza;

    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription()+"+Cheese";
    }

    @Override
    public Integer getCost() {
        return this.basePizza.getCost()+20;
    }
}
