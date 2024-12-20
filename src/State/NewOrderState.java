package State;

public class NewOrderState implements State {

    @Override
    public void pay(OrderContext context) {
        System.out.println("Payment Successful!");
        context.setCurrentState(new ProcessingState());
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Order cannot be shipped until payment is made.");
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Order cannot be delivered until payment is made.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Order cancelled!");
        context.setCurrentState(new CancelledState());
    }
}
