package org.example.parkingLot.vehicle;

public abstract class Vehicle {
    private String registerNumber;
    private VehicleType type;

    public Vehicle(String vehicleRegisterNumber, VehicleType vehicleType) {
        this.registerNumber = vehicleRegisterNumber;
        this.type = vehicleType;
    }

    public VehicleType getVehicleType() {
        return type;
    }

    public String getVehicleRegisterNumber() {
        return registerNumber;
    }
}

