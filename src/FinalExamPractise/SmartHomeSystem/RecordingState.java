package FinalExamPractise.SmartHomeSystem;

public class RecordingState implements SecurityCameraState {

    @Override
    public void nextState(SecurityCameraSystem securityCameraSystem) {
        if(securityCameraSystem.isThreatDetected()) {
            securityCameraSystem.setCurrentState(new AlertState());
            System.out.println("Recording state to alert state");
        }else if(!securityCameraSystem.isMotionDetected()) {
            securityCameraSystem.setCurrentState(new IdleState());
            System.out.println("Recording state to idle state");
        }else {
            System.out.println("Already in recording state");
        }
    }
}
