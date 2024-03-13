package org.example.parkingLot;

import org.example.parkingLot.parkingSpotVehicles.ParkingSpotType;

public class DisplayBoard {
    public void displayMessage(ParkingSpotType parkingSpotType, int freeSpots) {
        String message = parkingSpotType + " spots free: " + freeSpots;
        System.out.println(message);
    }
}
