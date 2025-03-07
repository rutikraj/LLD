package payment;

public class HourlyPaymentStratergy implements PaymentStratergy{
    private double charges;

    public HourlyPaymentStratergy(double charges) {
        this.charges = charges;
    }

    @Override
    public double calculateFee(long duration) {
        return duration/3600 * charges;
    }
}
