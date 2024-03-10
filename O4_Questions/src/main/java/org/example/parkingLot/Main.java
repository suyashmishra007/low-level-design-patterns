package org.example.parkingLot;
import org.example.parkingLot.account.Admin;
import org.example.parkingLot.parking.*;
import org.example.parkingLot.parkingVehicles.CarSpot;
import org.example.parkingLot.parkingVehicles.MotorcycleSpot;
import org.example.parkingLot.vehicle.Car;
import org.example.parkingLot.vehicle.MotorCycle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a parking lot instance
        ParkingLot parkingLot = ParkingLot.getInstance();

        // Creating Admin account
        Admin admin = new Admin("Jack", "Pass12345");

        // Adding Parking floors
        ParkingFloor parkingFloor1 = new ParkingFloor("PF1001");
        ParkingFloor parkingFloor2 = new ParkingFloor("PF1002");
        admin.addParkingFloor(parkingFloor1);
        admin.addParkingFloor(parkingFloor2);

        // Adding Entry panels
        EntryPanel entryPanel1 = new EntryPanel("ENT001");
        EntryPanel entryPanel2 = new EntryPanel("ENT002");
        admin.addEntrancePanel(entryPanel1);
        admin.addEntrancePanel(entryPanel2);


        // Adding Exit panels
        ExitPanel exitPanel1 = new ExitPanel("EXT001");
        ExitPanel exitPanel2 = new ExitPanel("EXT002");
        admin.addExitPanel(exitPanel1);
        admin.addExitPanel(exitPanel2);

        List<ParkingFloor> listOfParkingFloors = parkingLot.getListOfParkingFloor();
        String firstFloorID = null;

        if (!listOfParkingFloors.isEmpty()) {
            ParkingFloor firstFloor = listOfParkingFloors.get(0);
            if (firstFloor != null) {
                firstFloorID = firstFloor.getParkingFloorID();
            }
        }

        // Adding Parking spots to the floor
        CarSpot carParkingSpot1 = new CarSpot("CPS1001");
        admin.addParkingSpot(firstFloorID, carParkingSpot1);
        CarSpot carParkingSpot2 = new CarSpot("CPS1002");
        admin.addParkingSpot(firstFloorID, carParkingSpot2);
        MotorcycleSpot bikeParkingSpot1 = new MotorcycleSpot("MSP1001");
        admin.addParkingSpot(firstFloorID, bikeParkingSpot1);
        MotorcycleSpot bikeParkingSpot2 = new MotorcycleSpot("MSP1002");
        admin.addParkingSpot(firstFloorID, bikeParkingSpot2);


        // Creating vehicles
        Car car1 = new Car("TN23890");
        Car car2 = new Car("TN99234");
        MotorCycle bike = new MotorCycle("TN34909");


        // Call the display board
        parkingFloor1.showDisplayBoard();

        // Park the vehicle
        ParkingTicket ticketForCar1 = entryPanel1.getParkingTicket(car1);
        System.out.println("*** Parking ticket for car1 *** \n" +  ticketForCar1);

        // Checkout the vehicle
        ticketForCar1 = exitPanel2.checkout(ticketForCar1);
        System.out.println("*** Parking ticket for car1 *** \n" + ticketForCar1);
    }
}

/*
Objects:
Vehicle(Number,type) , Ticket(EntryTime,parkingSpot,prices) , Entrance(FindParkingSpace,updateParkingSpace,GenerateTicket) , ParkingSpot(id,isEmpty,vehicle,price,type) , Exit Gate(costCalculation,payment,updateParkingSpot)

Requirement Clarification:
    -> How many entrances ? 1 entrance nad 1 exit.
    -> Different types of parking spot ? 2 wheeler and 4 wheeler
    -> Payment based on Hourly or minutes ? Mixed (Minutes or Hourly)
    -> Parking Spot should be nearest to the entrance.
    -> No Parking floors.


- The parking lot should have multiple floors where customers can park their cars.
- The parking lot should have multiple entry and exit points.
- Customers can collect a parking ticket from the entry points and can pay the parking fee at the exit points to the parking attendant or automated exit panel
- Customers can pay via both cash and credit cards.
- The system should not allow more vehicles than the maximum capacity of the parking lot. If the parking is full, the system should be able to show a message at the entrance panel and on the parking display board on the ground floor.
- Each parking floor will have many parking spots. The system should support multiple types of parking spots such as Compact, Large, Disabled, Motorcycle, etc.
- The system should support parking for different types of vehicles like car, truck, van, motorcycle, etc.
- Each parking floor should have a display board showing any free parking spot for each spot type.
- The system should support a per-hour parking fee model. For example, customers have to pay some amount based on the Vehicle type.
- Admins should be able to add parking floors and parking spot.
*/