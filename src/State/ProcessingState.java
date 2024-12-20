package State;

public class ProcessingState implements State {
    @Override
    public void pay(OrderContext context) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Order is now shipped.");
        context.setCurrentState(new ShippedState());
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Order cannot be delivered directly from Processing State.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order has been cancelled.");
        context.setCurrentState(new CancelledState());
    }
}
