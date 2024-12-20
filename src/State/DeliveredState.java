package State;

public class DeliveredState implements State {
    @Override
    public void pay(OrderContext context) {
        System.out.println("Order is already completed.");
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order cannot be cancelled once delivered.");
    }
}
