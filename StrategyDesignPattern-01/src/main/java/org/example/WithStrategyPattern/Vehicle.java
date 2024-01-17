package org.example.WithStrategyPattern;

import org.example.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // Knows as constructor injection
    public Vehicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
