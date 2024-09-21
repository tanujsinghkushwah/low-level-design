package org.example.strategydesign.models;

public class NormalDriveStrategy implements DriveStrategyInterface {

    @Override
    public void drive() {
        System.out.println("Operating on normal drive mode.");
    }
}
