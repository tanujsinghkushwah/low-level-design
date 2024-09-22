package org.example.decoratordesign.models;

public abstract class BasePizza {

    String description="UNKNOWN";

    public String getDescription() {
        return description;
    }

    public abstract Integer getCost();
}
