package FinalExamPractise.SmartHomeSystem;

public class BrightState implements LightingState {

    @Override
    public void nextState(LightingSystem lightingSystem) {
        if(lightingSystem.isPresent()) {
            System.out.println("Already in bright state");
        }else {
            lightingSystem.setCurrentState(new DimState());
            System.out.println("Bright state to dim state");
        }
    }
}
