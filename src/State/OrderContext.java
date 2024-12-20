package State;

public class OrderContext {
    private State currentState;

    public OrderContext() {
        this.currentState = new NewOrderState();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void pay() {
        currentState.pay(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void ship() {
        currentState.ship(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }
}
