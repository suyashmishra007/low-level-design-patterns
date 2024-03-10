package org.example.parkingLot.parking;


import org.example.parkingLot.vehicle.Vehicle;

public class EntryPanel {
    private String entryPanelID;

    public EntryPanel(String entryPanelID) {
        this.entryPanelID = entryPanelID;
    }

    public String getEntryPanelID() {
        return entryPanelID;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingFloor parkingFloor = parkingLot.getListOfParkingFloor()
                .stream()
                .filter(floor -> floor.canPark(vehicle))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Parking is unsupported for this " + vehicle.getVehicleType() + " type"));

        ParkingSpot spot = parkingFloor.getAvailableSpot(vehicle);
        if (spot == null) {
            throw new IllegalStateException("No spots are available for " + vehicle.getVehicleType());
        }

        ParkingTicket ticket = generateParkingTicket(vehicle, parkingFloor.getParkingFloorID(), spot.getParkingSpotID());
        spot.assignVehicleToSpot(vehicle);
        return ticket;
    }

    private ParkingTicket generateParkingTicket(Vehicle vehicle, String parkingFloorID, String parkingSpotID) {
        // TODO: Changes
//        return new ParkingTicket(vehicle.getVehicleType(), vehicle.getVehicleRegisterNumber(), parkingFloorID, parkingSpotID).setStartTime();
        return new ParkingTicket(vehicle.getVehicleType(), vehicle.getVehicleRegisterNumber(), parkingFloorID, parkingSpotID).setStartTime();
    }
}