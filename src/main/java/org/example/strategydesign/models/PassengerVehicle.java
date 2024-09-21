package org.example.strategydesign.models;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle(NormalDriveStrategy normalDriveStrategy) {
        super(normalDriveStrategy);
    }

}
