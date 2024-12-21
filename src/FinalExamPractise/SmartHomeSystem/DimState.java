package FinalExamPractise.SmartHomeSystem;

public class DimState implements LightingState {

    @Override
    public void nextState(LightingSystem lightingSystem) {
        if(lightingSystem.isPresent()) {
            lightingSystem.setCurrentState(new BrightState());
            System.out.println("Dim state to bright state");
        }else {
            System.out.println("Already in dim state");
        }
    }
}
