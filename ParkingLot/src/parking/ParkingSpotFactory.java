package parking;

import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingSpotFactory {
    public static SpotType getSpotType(Vehicle vehicle) {
        if(vehicle.getVehicleType() == VehicleType.BIKE)
            return SpotType.SMALL;
        if(vehicle.getVehicleType() == VehicleType.CAR)
            return SpotType.MEDIUM;
        if(vehicle.getVehicleType() == VehicleType.TRUCK)
            return SpotType.LARGE;
        return null;
    }
}
