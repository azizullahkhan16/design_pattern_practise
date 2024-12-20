package State;

public class CancelledState implements State{
    @Override
    public void pay(OrderContext context) {
        System.out.println("Order is cancelled. Cannot make a payment.");
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Order is cancelled. Cannot be shipped.");
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Order is cancelled. Cannot be delivered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order is already cancelled.");
    }
}
