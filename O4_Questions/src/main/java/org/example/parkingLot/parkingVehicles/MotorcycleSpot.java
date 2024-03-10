package org.example.parkingLot.parkingVehicles;

import org.example.parkingLot.parking.ParkingSpotType;

public class MotorcycleSpot extends ParkingSpot{
    public MotorcycleSpot(String id) {
        super(id, ParkingSpotType.Motorcycle);
    }
}
