package org.example.parkingLot.parking;


import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> parkingFloors;
    private List<EntryPanel> entryPanels;
    private List<ExitPanel> exitPanels;

    private ParkingLot() {
        this.parkingFloors = new ArrayList<>();
        this.entryPanels = new ArrayList<>();
        this.exitPanels = new ArrayList<>();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public ParkingSpot vacateParkingSpot(String parkingSpotID) {
        for (ParkingFloor floor : parkingFloors) {
            // TODO: For Each is not working.
//            for (ParkingSpot spot : floor.getListOfParkingSpots()) {
//                if (spot.getParkingSpotID().equals(parkingSpotID)) {
//                    spot.vacateVehicleFromSpot();
//                    return spot;
//                }
//            }
        }
        return null;
    }

    public List<ParkingFloor> getListOfParkingFloor() {
        return parkingFloors;
    }

    public List<EntryPanel> getListOfEntryPanel() {
        return entryPanels;
    }

    public List<ExitPanel> getListOfExitPanel() {
        return exitPanels;
    }
}
