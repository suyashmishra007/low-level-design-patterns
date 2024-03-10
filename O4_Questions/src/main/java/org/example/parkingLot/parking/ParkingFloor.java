package org.example.parkingLot.parking;
import org.example.parkingLot.vehicle.Vehicle;
import org.example.parkingLot.vehicle.VehicleType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ParkingFloor {
    private Map<ParkingSpotType, List<ParkingSpot>> parkingSpots;
    private String parkingFloorID;
    private DisplayBoard displayBoard;

    public ParkingFloor(String parkingFloorID) {
        this.parkingSpots = new HashMap<>();
        this.parkingSpots.put(ParkingSpotType.Compact, new ArrayList<>());
        this.parkingSpots.put(ParkingSpotType.Motorcycle, new ArrayList<>());
        this.parkingSpots.put(ParkingSpotType.Large, new ArrayList<>());
        this.parkingSpots.put(ParkingSpotType.ElectricCar, new ArrayList<>());
        this.parkingFloorID = parkingFloorID;
        this.displayBoard = new DisplayBoard();
    }

    public String getParkingFloorID() {
        return parkingFloorID;
    }

    public Map<ParkingSpotType, List<ParkingSpot>> getListOfParkingSpots() {
        return parkingSpots;
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle) {
        ParkingSpotType spotType = getSpotTypeForVehicle(vehicle.getVehicleType());
        List<ParkingSpot> spots = parkingSpots.get(spotType);
        if (spots != null) {
            for (ParkingSpot spot : spots) {
                if (spot.isSpotFree()) {
                    return spot;
                }
            }
        }
        return null;
    }

    public void showDisplayBoard() {
        for (ParkingSpotType spotType : parkingSpots.keySet()) {
            List<ParkingSpot> spots = parkingSpots.get(spotType);
            if (spots != null) {
                long freeSpots = spots.stream().filter(ParkingSpot::isSpotFree).count();
                displayBoard.displayMessage(spotType, (int) freeSpots);
            }
        }
    }

    private ParkingSpotType getSpotTypeForVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case Car:
                return ParkingSpotType.Compact;
            case Motorcycle:
                return ParkingSpotType.Motorcycle;
            default:
                return ParkingSpotType.Large;
        }
    }

    public List<String> getInUseSpotID(VehicleType vehicleType) {
        List<String> inUseSpotIDs = new ArrayList<>();
        ParkingSpotType spotType = getSpotTypeForVehicle(vehicleType);
        List<ParkingSpot> spots = parkingSpots.get(spotType);
        if (spots != null) {
            for (ParkingSpot spot : spots) {
                if (!spot.isSpotFree()) {
                    inUseSpotIDs.add(spot.getParkingSpotID());
                }
            }
        }
        return inUseSpotIDs;
    }

    public boolean canPark(Vehicle vehicle) {
        ParkingSpotType spotType = getSpotTypeForVehicle(vehicle.getVehicleType());
        List<ParkingSpot> spots = parkingSpots.get(spotType);
        return spots != null && !spots.isEmpty();
    }
}
