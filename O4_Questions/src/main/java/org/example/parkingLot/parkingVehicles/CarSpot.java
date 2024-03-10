package org.example.parkingLot.parkingVehicles;

import org.example.parkingLot.parking.ParkingSpotType;

public class CarSpot extends ParkingSpot {
    public CarSpot(String id) {
        super(id, ParkingSpotType.Compact);
    }
}