package org.example.strategydesign;

import org.example.strategydesign.models.*;

public class RunStrategy {

    public void runDesignPattern() {
        Vehicle passengerVehicle = new PassengerVehicle(new NormalDriveStrategy());
        Vehicle sportsVehicle = new SportsVehicle(new SpecialDriveStrategy());

        passengerVehicle.getDriveStrategyInterface();
        sportsVehicle.getDriveStrategyInterface();
    }
}
