package org.example.parkingLot.parking;


import org.example.parkingLot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private String parkingSpotID;
    private boolean isSpotAvailable;
    private Vehicle vehicle;
    private ParkingSpotType parkingSpotType;

    public ParkingSpot(String parkingSpotId, ParkingSpotType parkingSpotType) {
        this.isSpotAvailable = true;
        this.parkingSpotID = parkingSpotId;
        this.vehicle = null;
        this.parkingSpotType = parkingSpotType;
    }

    public boolean isSpotFree() {
        return isSpotAvailable;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public String getParkingSpotID() {
        return parkingSpotID;
    }

    public Vehicle getVehicleDetails() {
        return vehicle;
    }

    public void assignVehicleToSpot(Vehicle vehicle) {
        if (!isSpotAvailable) {
            throw new IllegalStateException("No spots are available for " + vehicle.getVehicleType());
        }
        this.vehicle = vehicle;
        this.isSpotAvailable = false;
    }

    public void vacateVehicleFromSpot() {
        this.vehicle = null;
        this.isSpotAvailable = true;
    }
}

