package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public static ParkingLot getParkingLot() {
        return parkingLot;
    }

    public static void setParkingLot(ParkingLot parkingLot) {
        ParkingLot.parkingLot = parkingLot;
    }

    private final List<ParkingFloor> parkingFloors;

    private ParkingLot(int numberOfFloor, int small, int medium, int large) {
        this.parkingFloors = new ArrayList<>();
        for(int i = 0; i < numberOfFloor; i++){
            parkingFloors.add(new ParkingFloor(small, medium, large));
        }
    }

    public static synchronized ParkingLot getInstance(int numFloors, int small, int medium, int large){
        if(parkingLot == null){
            parkingLot = new ParkingLot(numFloors, small, medium, large);
        }
        return parkingLot;
    }

}
