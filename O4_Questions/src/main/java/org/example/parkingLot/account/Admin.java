package org.example.parkingLot.account;
import java.util.List;
import org.example.parkingLot.parking.*;
import org.example.parkingLot.parkingVehicles.ParkingSpot;


public class Admin extends Account {

    public Admin(String username, String password) {
        super(username, password);
    }

    public boolean addParkingFloor(ParkingFloor parkingFloor) {
        List<ParkingFloor> listOfParkingFloors = ParkingLot.getInstance().getListOfParkingFloor();
        if (!listOfParkingFloors.contains(parkingFloor)) {
            listOfParkingFloors.add(parkingFloor);
            return true;
        }
        return false;
    }

    public void addParkingSpot(String parkingFloorID, ParkingSpot parkingSpot) {
        ParkingFloor floor = ParkingLot.getInstance().getListOfParkingFloor()
                .stream()
                .filter(pf -> pf.getParkingFloorID().equals(parkingFloorID))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid floor"));
        // TODO: Error
//        if (!floor.getListOfParkingSpots().contains(parkingSpot)) {
//            floor.getListOfParkingSpots().add(parkingSpot);
//        }
    }

    public boolean addEntrancePanel(EntryPanel entryPanel) {
        List<EntryPanel> listOfEntryPanels = ParkingLot.getInstance().getListOfEntryPanel();
        if (!listOfEntryPanels.contains(entryPanel)) {
            listOfEntryPanels.add(entryPanel);
            return true;
        }
        return false;
    }

    public boolean addExitPanel(ExitPanel exitPanel) {
        List<ExitPanel> listOfExitPanels = ParkingLot.getInstance().getListOfExitPanel();
        if (!listOfExitPanels.contains(exitPanel)) {
            listOfExitPanels.add(exitPanel);
            return true;
        }
        return false;
    }
}
