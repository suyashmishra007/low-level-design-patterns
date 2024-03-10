package org.example.parkingLot.parking;
public class DisplayBoard {
    public void displayMessage(ParkingSpotType parkingSpotType, int freeSpots) {
        String message = parkingSpotType + " spots free: " + freeSpots;
        System.out.println(message);
    }
}
