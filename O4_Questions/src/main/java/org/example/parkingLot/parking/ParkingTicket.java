package org.example.parkingLot.parking;
import org.example.parkingLot.vehicle.*;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    private String parkingTicketID;
    private VehicleType vehicleType;
    private String vehicleRegisterNumber;
    private String parkingSpotID;
    private String parkingFloorID;
    private Date startTime;
    private Date endTime;
    private double amount;

    public ParkingTicket(VehicleType vehicleType, String vehicleRegisterNumber, String parkingFloorID, String parkingSpotID) {
        this.vehicleType = vehicleType;
        this.vehicleRegisterNumber = vehicleRegisterNumber;
        this.parkingFloorID = parkingFloorID;
        this.parkingSpotID = parkingSpotID;
        this.parkingTicketID = UUID.randomUUID().toString();
    }

    public ParkingTicket setStartTime() {
        this.startTime = currentDateTime;
        return this;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public double getAmount() {
        return this.amount;
    }

    public ParkingTicket setEndTime(Date currentDateTime) {
        this.endTime = currentDateTime;
        return this;
    }

    public ParkingTicket setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public String getParkingSpotID() {
        return this.parkingSpotID;
    }

    public String getParkingFloorID() {
        return this.parkingFloorID;
    }

    public String getVehicleRegisterNumber() {
        return this.vehicleRegisterNumber;
    }
}
