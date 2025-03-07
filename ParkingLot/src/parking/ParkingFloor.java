package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingFloor {
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    private final List<ParkingSpot> parkingSpots;

    public ParkingFloor(int small, int medium, int large) {
        this.parkingSpots = new ArrayList<>();
        for(int i = 0; i < small; i++){
            parkingSpots.add(new ParkingSpot(SpotType.SMALL));
        }
        for(int i = 0; i < medium; i++){
            parkingSpots.add(new ParkingSpot(SpotType.MEDIUM));
        }
        for(int i = 0; i < large; i++){
            parkingSpots.add(new ParkingSpot(SpotType.LARGE));
        }
    }

    public ParkingSpot getAvailableSpot(SpotType spotType) {
        return parkingSpots.stream().filter(spot -> spot.getSpotType() == spotType && spot.isAvailable()).findFirst().get();
    }
}
