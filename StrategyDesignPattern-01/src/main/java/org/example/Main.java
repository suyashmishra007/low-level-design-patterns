package org.example;

import org.example.WithStrategyPattern.GoodsVehicle;
import org.example.WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}