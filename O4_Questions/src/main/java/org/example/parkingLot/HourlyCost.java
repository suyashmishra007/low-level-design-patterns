package org.example.parkingLot;

import org.example.parkingLot.parkingSpotVehicles.ParkingSpotType;

import java.util.HashMap;
import java.util.Map;

public class HourlyCost {
    private Map<ParkingSpotType, Integer> hourlyCosts = new HashMap<>();

    public HourlyCost() {
        hourlyCosts.put(ParkingSpotType.Compact, 25);
        hourlyCosts.put(ParkingSpotType.Disabled, 15);
        hourlyCosts.put(ParkingSpotType.ElectricCar, 35);
        hourlyCosts.put(ParkingSpotType.Large, 45);
        hourlyCosts.put(ParkingSpotType.Motorcycle, 15);
    }

    public int getCost(ParkingSpotType parkingSpotType) {
        if (hourlyCosts.containsKey(parkingSpotType)) {
            return hourlyCosts.get(parkingSpotType);
        } else {
            throw new IllegalArgumentException(
                    "Hourly cost is not associated with " + parkingSpotType + " type"
            );
        }
    }
}
