package FinalExamPractise.SmartHomeSystem;

public class CoolingState implements ThermostatState {
    @Override
    public void nextState(ThermostatSystem thermostatSystem) {
        if(thermostatSystem.getTemperature() < ThermostatSystem.MIN_TEMPERATURE) {
            thermostatSystem.setCurrentState(new HeatingState());
            System.out.println("Cooling state to heating state");
        }else if(thermostatSystem.getTemperature() >= ThermostatSystem.MIN_TEMPERATURE && thermostatSystem.getTemperature() < ThermostatSystem.MAX_TEMPERATURE) {
            thermostatSystem.setCurrentState(new StandByState());
            System.out.println("Cooling state to standby state");
        }else if(thermostatSystem.getTemperature() >= ThermostatSystem.MAX_TEMPERATURE) {
            System.out.println("Already in cooling state");
        }
    }
}
