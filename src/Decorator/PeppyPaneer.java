package Decorator;

public class PeppyPaneer extends Pizza{
    public PeppyPaneer() {
        super.description = "Peppy Paneer";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
