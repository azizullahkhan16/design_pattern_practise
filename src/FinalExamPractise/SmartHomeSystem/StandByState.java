package FinalExamPractise.SmartHomeSystem;

public class StandByState implements ThermostatState {

    @Override
    public void nextState(ThermostatSystem thermostatSystem) {
        if(thermostatSystem.getTemperature() < ThermostatSystem.MIN_TEMPERATURE) {
            thermostatSystem.setCurrentState(new HeatingState());
            System.out.println("Standby state to heating state");
        }else if(thermostatSystem.getTemperature() >= ThermostatSystem.MIN_TEMPERATURE && thermostatSystem.getTemperature() < ThermostatSystem.MAX_TEMPERATURE) {
            System.out.println("Already in standby state");
        }else if(thermostatSystem.getTemperature() >= ThermostatSystem.MAX_TEMPERATURE) {
            thermostatSystem.setCurrentState(new CoolingState());
            System.out.println("Standby state to cooling state");
        }
    }
}
