package State;

public class ShippedState implements State {
    @Override
    public void pay(OrderContext context) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Order is now delivered.");
        context.setCurrentState(new DeliveredState());
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order cannot be cancelled once shipped.");
    }
}
