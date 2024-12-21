package FinalExamPractise.SmartHomeSystem;

public class LightingSystem{
    private boolean present;
    private LightingState currentState;

    public LightingSystem() {
        this.currentState = new OffState();
        this.present = false;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
        this.currentState.nextState(this);
    }

    public LightingState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LightingState currentState) {
        this.currentState = currentState;
    }
}
