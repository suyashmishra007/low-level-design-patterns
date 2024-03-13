package org.example.parkingLot;

import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.UUID;
import org.example.parkingLot.vehicle.*;

public class ParkingTicket {

  private String parkingTicketID;
  private VehicleType vehicleType;
  private String vehicleRegisterNumber;
  private String parkingSpotID;
  private String parkingFloorID;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private double amount;

  public ParkingTicket(
    VehicleType vehicleType,
    String vehicleRegisterNumber,
    String parkingFloorID,
    String parkingSpotID
  ) {
    this.vehicleType = vehicleType;
    this.vehicleRegisterNumber = vehicleRegisterNumber;
    this.parkingFloorID = parkingFloorID;
    this.parkingSpotID = parkingSpotID;
    this.parkingTicketID = UUID.randomUUID().toString();
  }

  public ParkingTicket setStartTime() {
    LocalDateTime currentDateTime = LocalDateTime.now();
    this.startTime = LocalDateTime.parse("2024-03-13T21:47:20.787991300");
    return this;
  }

  public LocalDateTime getStartTime() {
    return this.startTime;
  }

  public LocalDateTime getEndTime() {
    this.endTime = LocalDateTime.now();
    return this.endTime;
  }

  public double getAmount() {
    return this.amount;
  }

  public ParkingTicket setEndTime(LocalDateTime currentDateTime) {
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
