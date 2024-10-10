package Decorator;

public class Farmhouse extends Pizza{

    public Farmhouse() {
        super.description = "Farmhouse";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
