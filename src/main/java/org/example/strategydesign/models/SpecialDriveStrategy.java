package org.example.strategydesign.models;

public class SpecialDriveStrategy implements DriveStrategyInterface {

    @Override
    public void drive() {
        System.out.println("Special drive mode activated!!");
    }
}
