package org.example.strategydesign.models;

public class Vehicle {

    DriveStrategyInterface driveStrategyInterface;

    Vehicle(DriveStrategyInterface driveStrategyInterface) {
        this.driveStrategyInterface = driveStrategyInterface;
    }

    public void getDriveStrategyInterface() {
        driveStrategyInterface.drive();
    }
}
