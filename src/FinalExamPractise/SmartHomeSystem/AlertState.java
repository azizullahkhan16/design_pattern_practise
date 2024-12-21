package FinalExamPractise.SmartHomeSystem;

public class AlertState implements SecurityCameraState{

    @Override
    public void nextState(SecurityCameraSystem securityCameraSystem) {
        if(securityCameraSystem.isMotionDetected()) {
            securityCameraSystem.setCurrentState(new RecordingState());
            System.out.println("Alert state to recording state");
        }else if(!securityCameraSystem.isThreatDetected()) {
            securityCameraSystem.setCurrentState(new IdleState());
            System.out.println("Alert state to idle state");
        }else {
            System.out.println("Already in alert state");
        }
    }
}
