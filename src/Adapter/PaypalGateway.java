package Adapter;

public class PaypalGateway {

    public void charge(double amount) {
        System.out.println("Making payment through Paypal: " + amount);
    }
}
