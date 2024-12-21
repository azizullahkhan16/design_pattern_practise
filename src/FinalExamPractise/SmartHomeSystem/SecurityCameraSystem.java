package FinalExamPractise.SmartHomeSystem;

public class SecurityCameraSystem{
    private boolean motionDetected;
    private boolean threatDetected;
    private SecurityCameraState currentState;

    public SecurityCameraSystem() {
        this.motionDetected = false;
        this.threatDetected = false;
        this.currentState = new IdleState();
    }

    public boolean isThreatDetected() {
        return threatDetected;
    }

    public void setThreatDetected(boolean threatDetected) {
        this.threatDetected = threatDetected;
        this.currentState.nextState(this);
    }

    public boolean isMotionDetected() {
        return motionDetected;
    }

    public void setMotionDetected(boolean motionDetected) {
        this.motionDetected = motionDetected;
        this.currentState.nextState(this);
    }

    public SecurityCameraState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(SecurityCameraState currentState) {
        this.currentState = currentState;
    }
}
