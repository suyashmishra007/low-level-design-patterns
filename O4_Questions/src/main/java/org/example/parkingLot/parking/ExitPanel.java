package org.example.parkingLot.parking;
import java.time.Duration;

public class ExitPanel {
    private String exitPanelID;

    public ExitPanel(String exitPanelID) {
        this.exitPanelID = exitPanelID;
    }

    public String getExitPanelID() {
        return exitPanelID;
    }

    public ParkingTicket checkout(ParkingTicket parkingTicket) {
        String parkingSpotID = parkingTicket.getParkingSpotID();
        long totalDurationInHours = calculateDurationInHours(parkingTicket);
        ParkingSpot vacatedSpot = ParkingLot.getInstance().vacateParkingSpot(parkingSpotID);

        if (vacatedSpot == null) {
            throw new IllegalStateException("Unable to find the Parking Spot for the given ID");
        }

        double totalAmount = calculatePrice(vacatedSpot.getParkingSpotType(), totalDurationInHours);

        parkingTicket.setAmount(totalAmount);
        return parkingTicket;
    }

    private double calculatePrice(ParkingSpotType parkingSpotType, long duration) {
        double cost = new HourlyCost().getCost(parkingSpotType);
        return duration == 0 ? 1 * cost : duration * cost;
    }

    private long calculateDurationInHours(ParkingTicket parkingTicket) {
        Duration duration = Duration.between(parkingTicket.getStartTime(), parkingTicket.getEndTime());
        return duration.toHours();
    }
}
