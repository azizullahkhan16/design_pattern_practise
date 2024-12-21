package FinalExamPractise.SmartHomeSystem;

public class OffState implements LightingState{

    @Override
    public void nextState(LightingSystem lightingSystem) {
        if(lightingSystem.isPresent()) {
            lightingSystem.setCurrentState(new BrightState());
            System.out.println("Off state to bright state");
        }else {
            System.out.println("Already in Off state");
        }
    }
}
