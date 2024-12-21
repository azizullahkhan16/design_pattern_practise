package FinalExamPractise.SmartHomeSystem;

public class HeatingState implements ThermostatState {
    @Override
    public void nextState(ThermostatSystem thermostatSystem) {
        if(thermostatSystem.getTemperature() < ThermostatSystem.MIN_TEMPERATURE) {
            System.out.println("Already in Heating state");
        }else if(thermostatSystem.getTemperature() >= ThermostatSystem.MIN_TEMPERATURE && thermostatSystem.getTemperature() < ThermostatSystem.MAX_TEMPERATURE) {
            thermostatSystem.setCurrentState(new StandByState());
            System.out.println("Heating state to standby state");
        }else if(thermostatSystem.getTemperature() >= ThermostatSystem.MAX_TEMPERATURE) {
            thermostatSystem.setCurrentState(new CoolingState());
            System.out.println("Heating state to cooling state");
        }
    }
}
