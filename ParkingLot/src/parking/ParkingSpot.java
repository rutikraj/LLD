package parking;

import vehicle.Vehicle;

public class ParkingSpot {

    private int id;
    private Vehicle vehicle;
    private boolean isAvailable;
    private final SpotType spotType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public ParkingSpot(SpotType spotType) {
        this.spotType = spotType;
    }

    public void assignSpot(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }
    public void vecateSpot() {
        this.vehicle = null;
        this.isAvailable = true;
    }
}
