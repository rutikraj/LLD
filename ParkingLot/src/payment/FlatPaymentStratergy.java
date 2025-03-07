package payment;

public class FlatPaymentStratergy implements  PaymentStratergy{
    private double charges;

    public FlatPaymentStratergy(double charges){
        this.charges = charges;
    }

    @Override
    public double calculateFee(long duration) {
        return charges;
    }
}
