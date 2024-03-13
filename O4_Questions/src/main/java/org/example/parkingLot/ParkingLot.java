package org.example.parkingLot;


import org.example.parkingLot.parkingSpotVehicles.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> parkingFloors;

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    private List<EntryPanel> entryPanels;

    public void setEntryPanels(List<EntryPanel> entryPanels) {
        this.entryPanels = entryPanels;
    }

    public void setExitPanels(List<ExitPanel> exitPanels) {
        this.exitPanels = exitPanels;
    }

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
