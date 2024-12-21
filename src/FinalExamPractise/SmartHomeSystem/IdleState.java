package FinalExamPractise.SmartHomeSystem;

import Builder.Packing;

public class IdleState implements SecurityCameraState{
    @Override
    public void nextState(SecurityCameraSystem securityCameraSystem) {
        if(securityCameraSystem.isMotionDetected()) {
            securityCameraSystem.setCurrentState(new RecordingState());
            System.out.println("Idle state to Recording state");
        }else if(securityCameraSystem.isThreatDetected()) {
            securityCameraSystem.setCurrentState(new AlertState());
            System.out.println("Idle state to Alert state");
        }else {
            System.out.println("Already in Idle state");
        }
    }
}
