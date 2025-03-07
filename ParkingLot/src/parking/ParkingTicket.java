package parking;

import payment.PaymentStratergy;
import vehicle.Vehicle;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ParkingTicket {

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public ParkingTicket(Vehicle vehicle, PaymentStratergy paymentStratergy, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
        this.paymentStratergy  = paymentStratergy;
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }



    public PaymentStratergy getPaymentStratergy() {
        return paymentStratergy;
    }

    public void setPaymentStratergy(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private ParkingSpot parkingSpot;
    private PaymentStratergy paymentStratergy;

    public double calculate() {
        exitTime = LocalDateTime.now();
        long duration = exitTime.toInstant(ZoneOffset.UTC).toEpochMilli() - entryTime.toInstant(ZoneOffset.UTC).toEpochMilli();
        return paymentStratergy.calculateFee(duration);
    }
}
