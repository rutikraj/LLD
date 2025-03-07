import parking.ParkingLot;
import parking.ParkingManagement;
import parking.ParkingTicket;
import payment.HourlyPaymentStratergy;
import vehicle.Bike;
import vehicle.Car;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance(2, 10, 5, 2);

        ParkingManagement management = ParkingManagement.getInstance(parkingLot, new HourlyPaymentStratergy(5.0));

        Vehicle bike = new Bike("BIKE-5678");
        Vehicle car = new Car("CAR-1234");

        ParkingTicket ticket1 = management.parkVehicle(bike);
        ParkingTicket ticket2 = management.parkVehicle(car);

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        double feeBike = management.removeVehicle(ticket1);
        System.out.println("Bike Parking Fee: $" + feeBike);

        double feeCar = management.removeVehicle(ticket2);
        System.out.println("Car Parking Fee: $" + feeCar);
    }
}