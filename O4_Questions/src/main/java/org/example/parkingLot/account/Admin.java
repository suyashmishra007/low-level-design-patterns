package org.example.parkingLot.account;
import java.util.List;

import org.example.parkingLot.EntryPanel;
import org.example.parkingLot.ExitPanel;
import org.example.parkingLot.ParkingFloor;
import org.example.parkingLot.ParkingLot;
import org.example.parkingLot.parkingSpotVehicles.ParkingSpot;


public class Admin extends Account {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        List<ParkingFloor> listOfParkingFloors = ParkingLot.getInstance().getListOfParkingFloor();
        boolean ans = listOfParkingFloors.contains(parkingFloor);
        if (!ans) {
            listOfParkingFloors.add(parkingFloor);
            ParkingLot.getInstance().setParkingFloors(listOfParkingFloors);
        }
    }

//    public void addParkingSpot(String parkingFloorID, ParkingSpot parkingSpot) {
//        ParkingFloor floor = ParkingLot.getInstance().getListOfParkingFloor()
//                .stream()
//                .filter(pf -> pf.getParkingFloorID().equals(parkingFloorID))
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("Invalid floor"));
//
//
//        System.out.println(floor);
//        boolean value = floor.getListOfParkingSpots().containsValue(parkingSpot);
//
//        ParkingLot.getInstance().setParkingFloors(floor);
//        if (!floor.getListOfParkingSpots().containsKey(parkingSpot)) {
//            floor.getListOfParkingSpots().put(parkingSpot.getParkingSpotType(),)
////            ParkingLot.getInstance().setParkingFloors();
//
//        } else {
//            // Handle the case where the parking spot is already present
//            // For example:
//            System.out.println("Parking spot already exists on the floor.");
//        }
//    }
public void addParkingSpot(String parkingFloorID, ParkingSpot parkingSpot) {
    ParkingLot parkingLot = ParkingLot.getInstance();
    ParkingFloor floor = parkingLot.getListOfParkingFloor().stream()
            .filter(pf -> pf.getParkingFloorID().equals(parkingFloorID))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Invalid floor"));
    List<ParkingSpot> spotList =  floor.getListOfParkingSpots().get(parkingSpot.getParkingSpotType());
    if (spotList != null) {
        ParkingSpot existingSpot = spotList.stream()
                .filter(spot -> spot.getParkingSpotID().equals(parkingSpot.getParkingSpotID()))
                .findFirst()
                .orElse(null);

        if (existingSpot != null) {
            return;
        }
    } else {
        throw new RuntimeException("Invalid parking spot type");
    }
    spotList.add(parkingSpot);
}


    public void addEntrancePanel(EntryPanel entryPanel) {
        List<EntryPanel> listOfEntryPanels = ParkingLot.getInstance().getListOfEntryPanel();
        if (!listOfEntryPanels.contains(entryPanel)) {
            listOfEntryPanels.add(entryPanel);
            ParkingLot.getInstance().setEntryPanels(listOfEntryPanels);
        }
    }

    public void addExitPanel(ExitPanel exitPanel) {
        List<ExitPanel> listOfExitPanels = ParkingLot.getInstance().getListOfExitPanel();
        if (!listOfExitPanels.contains(exitPanel)) {
            listOfExitPanels.add(exitPanel);
            ParkingLot.getInstance().setExitPanels(listOfExitPanels);
        }
    }
}
