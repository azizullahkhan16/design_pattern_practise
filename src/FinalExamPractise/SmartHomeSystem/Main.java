package FinalExamPractise.SmartHomeSystem;

public class Main {
    public static void main(String[] args) {
//        LightingSystem lightingSystem = new LightingSystem();
//        lightingSystem.setPresent(true);
//        lightingSystem.setPresent(false);

//        SecurityCameraSystem securityCameraSystem = new SecurityCameraSystem();
//        securityCameraSystem.setMotionDetected(true);
//        securityCameraSystem.setThreatDetected(true);

        ThermostatSystem thermostatSystem = new ThermostatSystem();
        thermostatSystem.setTemperature(13);
        thermostatSystem.setTemperature(24);
        thermostatSystem.setTemperature(27);
    }
}
