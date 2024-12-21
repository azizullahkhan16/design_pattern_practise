package FinalExamPractise.SmartHomeSystem;

public class ThermostatSystem{
    public static final float MAX_TEMPERATURE = 26;
    public static final float MIN_TEMPERATURE = 16;
    private float temperature;
    private ThermostatState currentState;

    public ThermostatSystem() {
        this.currentState = new StandByState();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.currentState.nextState(this);
    }

    public ThermostatState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ThermostatState currentState) {
        this.currentState = currentState;
    }
}
