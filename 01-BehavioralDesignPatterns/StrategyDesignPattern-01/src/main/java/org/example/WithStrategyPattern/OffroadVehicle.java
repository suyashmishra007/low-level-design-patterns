package org.example.WithStrategyPattern;

import org.example.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle(){
        super(new SportsDriveStrategy());
    }
}
