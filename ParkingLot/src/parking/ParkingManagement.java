package parking;

import payment.PaymentStratergy;
import vehicle.Vehicle;

public class ParkingManagement {
    private static ParkingManagement parkingManagement;
    private final ParkingLot parkingLot;
    private PaymentStratergy paymentStratergy;


    private ParkingManagement(ParkingLot parkingLot, PaymentStratergy paymentStratergy) {
        this.parkingLot = parkingLot;
        this.paymentStratergy = paymentStratergy;
    }

    public static ParkingManagement getInstance(ParkingLot parkingLot, PaymentStratergy paymentStratergy){
        if(parkingManagement == null){
            parkingManagement = new ParkingManagement(parkingLot, paymentStratergy);
        }
        return parkingManagement;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle){
        SpotType spotType = ParkingSpotFactory.getSpotType(vehicle);
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            ParkingSpot parkingSpot = parkingFloor.getAvailableSpot(spotType);
            if(parkingSpot == null)
                continue;
            parkingSpot.assignSpot(vehicle);
            System.out.println("Parked vehicle");
            return new ParkingTicket(vehicle, paymentStratergy, parkingSpot);
        }
        return null;
    }

    public double removeVehicle(ParkingTicket parkingTicket){
        ParkingSpot parkingSpot = parkingTicket.getParkingSpot();
        parkingSpot.vecateSpot();
        return parkingTicket.calculate();
    }
    
}
