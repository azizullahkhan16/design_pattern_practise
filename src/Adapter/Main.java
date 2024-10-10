package Adapter;

public class Main {

    public static void main(String[] args) {
        PaymentGateway paypalGateway = new PaypalAdapter(new PaypalGateway());
        PaymentGateway stripeGateway = new StripeAdapter(new StripeGateway());

        double amount = 100.0;

        paypalGateway.processPayment(amount);
        stripeGateway.processPayment(amount);


    }
}
