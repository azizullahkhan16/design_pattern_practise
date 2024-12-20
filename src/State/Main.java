package State;

public class Main {
    public static void main(String[] args) {
        OrderContext context = new OrderContext();

        context.pay();
        context.ship();
        context.deliver();
        context.cancel();
    }
}
